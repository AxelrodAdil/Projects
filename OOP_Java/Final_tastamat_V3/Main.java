package OOP_Java.ISFINALN;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Order> orders = new ArrayList<>();
        ArrayList<Client> clients = new ArrayList<>();
        OnlineStoreManagement onlineStoreManagement = new OnlineStoreManagement(products, clients, orders);


        while(true){
            System.out.println("Enter[1] to creating" +
                    "\nEnter[2] to updating" +
                    "\nEnter[3] to deleting" +
                    "\nEnter[4] to make delivery");
            int choice = scanner.nextInt();

            switch (choice){
                case 1: {
                    System.out.println("Enter[1] to create product" +
                            "\nEnter[2] to create order" +
                            "\nEnter[3] to create client");

                    int choice2 = scanner.nextInt();

                    switch (choice2){
                        case 1:{
                            onlineStoreManagement.createProduct();
                            break;
                        }

                        case 2:{
                            onlineStoreManagement.createOrder();
                            break;
                        }

                        case 3:{
                            onlineStoreManagement.createClient();
                            break;
                        }
                    }

                    break;
                }

                case 2:{
                    System.out.println("Enter[1] to update product" +
                            "\nEnter[2] to update order" +
                            "\nEnter[3] to update client");

                    int choice2 = scanner.nextInt();

                    switch (choice2){
                        case 1:{
                            onlineStoreManagement.updateProduct();
                            break;
                        }
                        case 2:{
                            onlineStoreManagement.updateOrder();
                            break;
                        }
                        case 3:{
                            onlineStoreManagement.updateClient();
                            break;
                        }
                    }

                    break;
                }

                case 3:{
                    System.out.println("Enter[1] to delete product" +
                            "\nEnter[2] to delete order" +
                            "\nEnter[3] to delete client");

                    int choice2 = scanner.nextInt();

                    switch (choice2){
                        case 1:{
                            onlineStoreManagement.deleteProduct();
                            break;
                        }
                        case 2:{
                            onlineStoreManagement.deleteOrder();
                            break;
                        }
                        case 3:{
                            onlineStoreManagement.deleteClient();
                            break;
                        }
                    }

                    break;
                }

                case 4:{
                    onlineStoreManagement.makeDelivery();
                    break;
                }
            }

        }

    }
}
