package OOP_Java.Restaurant_Management;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Adil
 * on 30.10.2020, 10:15.
 */
public class Main {

    public static final Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        RestaurantManagementInterface restaurantManagement = new RestaurantManagement(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        byte menu = -1;
        while (menu != 0){
            System.out.println("PRESS [1] Manager\nPRESS [2] Client\nPRESS [0] Exit");
            menu = scn.nextByte();
            switch (menu){
                case 1:{
                    byte managerMenu = -1;
                    while (managerMenu != 0){
                        System.out.println("PRESS [1] Add client\nPRESS [2] Add product\nPRESS [3] Make an order\nPRESS [4] Clients list\nPRESS [0] Back");
                        managerMenu = scn.nextByte();
                        switch (managerMenu){
                            case 1: {
                                restaurantManagement.addClient();
                                break;
                            }
                            case 2:{
                                byte productMenu = -1;
                                while (productMenu != 0){
                                    System.out.println("PRESS [1] Add new product\nPRESS [2] Increase the amount of products\nPRESS [3] Products list\nPRESS [0] Back");
                                    productMenu = scn.nextByte();
                                    switch (productMenu){
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
                                int clientId = scn.nextInt();
                                if(restaurantManagement.checkClientId(clientId)){
                                    clientId--;
                                    restaurantManagement.makeAnOrder(clientId);
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
                    break;
                }
                case 2:{
                    System.out.print("Your id: ");
                    int id = scn.nextInt();
                    if(restaurantManagement.checkClientId(id)){
                        id--;
                        if(restaurantManagement.getClientData(id) instanceof Client) { // Check instanceof
                            System.out.println("Hello, " + restaurantManagement.getClientData(id).getName() + " " + restaurantManagement.getClientData(id).getSurname());
                            byte clientMenu = -1;
                            while (clientMenu != 0) {
                                System.out.println("PRESS [1] My orders\nPRESS [2] Make an order\nPRESS [0] Back");
                                clientMenu = scn.nextByte();
                                switch (clientMenu) {
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
                    break;
                }
            }
        }
    }
}
