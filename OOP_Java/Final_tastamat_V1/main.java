package OOP_Java.Final_tastamat;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    /**
     *
     * 910044;Nur-Sultan;ул.Сатпаева,23/1
     * 910009;Nur-Sultan;пр.Момышулы,16
     * 910198;Almaty;Орманова,129
     * 910061;Almaty,Жибек Жолы,50
     * 910100;Karaganda;пр.Нуркена Абдирова,19
     * 910156;Pavlodar;Лермонтова,91
     *
     */

    public static final Scanner sc = new Scanner(System.in);

    static void case_1 (RestaurantManagementInterface restaurantManagement){
        byte manager_byte = -1;
        while (manager_byte != 0){
            System.out.printf("%n%s%n%s%n%s%n%s%n%s%n", "[1] Add client", "[2] Add product", "[3] Make an order", "[4] Clients list", "[0] Back");
            manager_byte = sc.nextByte();

            switch (manager_byte){
                case 1: {
                    restaurantManagement.addClient();
                    break;
                }
                case 2:{
                    byte product_menu_byte = -1;
                    while (product_menu_byte != 0){
                        System.out.printf("%n%s%n%s%n%s%n%s%n", "[1] Add new product", "[2] Increase the amount of products", "[3] Products list", "[0] Back");
                        product_menu_byte = sc.nextByte();

                        switch (product_menu_byte){
                            case 1:{
                                restaurantManagement.addProduct();
                                break;
                            }
                            case 2:{
                                restaurantManagement.increaseAmountOfProducts();
                                break;
                            }
                            case 3:{
                                restaurantManagement.productList();
                                break;
                            }
                        }

                    }
                    break;
                }
                case 3:{
                    System.out.print("Client id: ");
                    int client_Id = sc.nextInt();

                    if(restaurantManagement.checkClientId(client_Id)){
                        client_Id--;
                        restaurantManagement.makeAnOrder(client_Id);
                    }else {
                        System.out.println("Client with this is not registered!");
                    }

                    break;
                }
                case 4:{
                    restaurantManagement.clientsList();
                    break;
                }

            }
        }
    }

    static void case_2(RestaurantManagementInterface restaurantManagement){
        System.out.print("Your id: ");
        int id = sc.nextInt();
        if(restaurantManagement.checkClientId(id)){
            id--;
            if(restaurantManagement.getClientData(id) instanceof Client) {
                System.out.println("Hello, " + restaurantManagement.getClientData(id).getName() + " " + restaurantManagement.getClientData(id).getSurname());
                byte client_byte = -1;
                while (client_byte != 0) {
                    System.out.printf("%n%s%n%s%n%s%n", "[1] My orders", "[2] Make an order", "[0] Back");
                    client_byte = sc.nextByte();

                    switch (client_byte) {
                        case 1: {
                            restaurantManagement.printClientsOrders(id);
                            break;
                        }
                        case 2: {
                            restaurantManagement.makeAnOrder(id);
                            break;
                        }
                    }

                }
            }
            else {
                System.out.println("Client with this is not registered!");
            }
        }else{
            System.out.println("Client with this is not registered!");
        }
    }

    public static void main(String[] args) {
        RestaurantManagementInterface restaurantManagement = new RestaurantManagement(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        int menu = -1;
        while (menu != 0){
            System.out.printf("%n%s    %s    %s     ", "[1] Manager", "[2] Client", "[0] Exit");
            menu = sc.nextByte();

            switch (menu){
                case 1:{
                    case_1(restaurantManagement);
                    break;
                }
                case 2:{
                    case_2(restaurantManagement);
                    break;
                }
            }

        }
    }
}