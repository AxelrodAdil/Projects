package OOP_Java.ISFINAL;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "iphone", 500000,10));// creating products
        products.add(new Product(2, "samsung", 350000,10));

        ArrayList<OrderProducts> orderProducts1 = new ArrayList<>();
        orderProducts1.add(new OrderProducts(1, 500000, 1));//creating order of the products
        ArrayList<OrderProducts> orderProducts2 = new ArrayList<>();
        orderProducts2.add(new OrderProducts(2, 350000, 1));
        ArrayList<OrderProducts> orderProducts3 = new ArrayList<>();
        orderProducts3.add(new OrderProducts(1, 500000, 3));



        ArrayList<Order> orders1 = new ArrayList<>();
        orders1.add(new Order(1,1, orderProducts1, 500000));//creating orders
        ArrayList<Order> orders2 = new ArrayList<>();
        orders2.add(new Order(2, 2,orderProducts2, 350000));
        ArrayList<Order> orders3 = new ArrayList<>();
        orders3.add(new Order(3,3, orderProducts3, 1500000));


        ArrayList<Order> orders = new ArrayList<>();//adding all orders into one arraylist
        orders.addAll(orders1);
        orders.addAll(orders2);
        orders.addAll(orders3);


        ArrayList<Client> clients = new ArrayList<>();//creating our clients
        clients.add(new OrdinaryClient(1, "John", "Johnson", orders1));
        clients.add(new PrimeClient(2, "Fhil", "Fhilson", orders2, 5));
        clients.add(new LoyalClient(3, "Mark", "Markson", orders3, 10,10));


      OnlineStoreManagement onlineStoreManagement = new OnlineStoreManagement(products, clients, orders);

         while (true)
        {
            System.out.println("[1] to  Create");
            System.out.println("[2] to Update");
            System.out.println("[3] to  Read");
            System.out.println("[4] to  Delete");
            System.out.println("[0] to  Exit");

            int choice = sc.nextInt();
            if(choice == 1){
                System.out.println("[1] to Add Products");
                System.out.println("[2] to Add Clients");
                System.out.println("[3] to Add Orders");
                int create_choice = sc.nextInt();

                if(create_choice == 1){
                    System.out.print("Insert ID: ");
                    int id = sc.nextInt();
                    System.out.print("Insert Name: ");
                    String name = sc.next();
                    System.out.print("Insert Price: ");
                    double price =  sc.nextDouble();
                    System.out.print("Insert Amount in Stock: ");
                    int amountinStock =  sc.nextInt();
                    Product product = new Product(id-1, name, price, amountinStock);
                    onlineStoreManagement.addProducts(product);
                }
                else if(create_choice == 2){
                    System.out.println("[1] for Ordinary Client");
                    System.out.println("[2] for Prime Client");
                    System.out.println("[3] for  Loyal Client");
                    ArrayList<Order> orderArrayList = new ArrayList<>();
                    int create_choice_part2 = sc.nextInt();
                    if(create_choice_part2 == 1){
                        System.out.print("Insert ID: ");
                        int id = sc.nextInt();
                        System.out.print("Insert Name: ");
                        String name = sc.next();
                        System.out.print("Insert Surname: ");
                        String surname = sc.next();
                        OrdinaryClient ordinaryClient = new OrdinaryClient(id-1, name, surname, orderArrayList);
                        onlineStoreManagement.addClient(ordinaryClient);
                    }
                    else if(create_choice_part2 == 2){
                        System.out.print("Insert ID: ");
                        int id = sc.nextInt();
                        System.out.print("Insert Name: ");
                        String name = sc.next();
                        System.out.print("Insert Surname: ");
                        String surname = sc.next();
                        System.out.print("Insert Discount: ");
                        int discount = sc.nextInt();
                        PrimeClient primeClient = new PrimeClient(id-1, name, surname, orderArrayList, discount);
                        onlineStoreManagement.addClient(primeClient);
                    }
                    else if(create_choice_part2 == 3){
                        System.out.print("Insert ID: ");
                        int id = sc.nextInt();
                        System.out.print("Insert Name: ");
                        String name = sc.next();
                        System.out.print("Insert Surname: ");
                        String surname = sc.next();
                        System.out.print("Insert Discount: ");
                        int discount = sc.nextInt();
                        System.out.print("Insert CashBack: ");
                        int cashback = sc.nextInt();
                        LoyalClient loyalClient = new LoyalClient(id-1, name, surname, orderArrayList, discount, cashback);
                        onlineStoreManagement.addClient(loyalClient);
                    }
                }
                else if(create_choice == 3){
                    onlineStoreManagement.listClients();
                    System.out.print("Choose the id Client: ");
                    int clientid = sc.nextInt();
                    System.out.print("Insert ID: ");
                    int id = sc.nextInt();
                    ArrayList<OrderProducts> productIds = new ArrayList<>();
                    System.out.print("Insert Total Price: ");
                    double totalPrice = sc.nextDouble();
                    Order order = new Order(id-1, clientid, productIds, totalPrice);
                    onlineStoreManagement.addOrder(order);
                    System.out.println(onlineStoreManagement.makeOrders(clientid));
                }
            }
            else if(choice == 2){

                System.out.println("[1] to  Update Products");
                System.out.println("[2] to  Update Clients");

                int update_choise = sc.nextInt();
                if(update_choise == 1) {
                    onlineStoreManagement.listProducts();
                    System.out.println("Insert the id: ");
                    int id = sc.nextInt();
                    products.remove(id-1);
                    onlineStoreManagement.updateProduct(id-1);
                }
                else if(update_choise == 2){
                    onlineStoreManagement.listClients();
                    System.out.println("Insert the id: ");
                    int id = sc.nextInt();
                    clients.remove(id-1);
                    onlineStoreManagement.updateClient(id-1);
                }

            }
            else if(choice == 3){
                System.out.println("[1] to List Products");
                System.out.println("[2] to  List Clients");
                System.out.println("[3] to List Orders");
                int choice_read = sc.nextInt();
                if(choice_read == 1) {
                    onlineStoreManagement.listProducts();
                }
                else if(choice_read == 2){
                    onlineStoreManagement.listClients();
                }
                else if(choice_read == 3){
                    onlineStoreManagement.listOrders();
                }
            }
            else if(choice == 4){
                System.out.println("[1] to Delete Products");
                System.out.println("[2] to  Delete Clients");
                System.out.println("[3] to  Delete Orders");

                int delete_choice = sc.nextInt();
                if(delete_choice == 1) {
                    onlineStoreManagement.listProducts();
                    System.out.println("Insert id which you wanna delete: ");
                    int id = sc.nextInt();
                    products.remove(id);
                    onlineStoreManagement.removeProducts(id);
                }
                else if(delete_choice == 2){
                    onlineStoreManagement.listClients();
                    System.out.println("Insert id which you wanna delete: ");
                    int id = sc.nextInt();
                    clients.remove(id);
                    onlineStoreManagement.removeClient(id);
                }
                else if(delete_choice == 3){
                    onlineStoreManagement.listOrders();
                    System.out.println("Insert id which you wanna delete: ");
                    int id = sc.nextInt();
                    orders.remove(id);
                    onlineStoreManagement.removeOrder(id);
                }
            }
            else if(choice == 0){
                System.out.println("You have exited!");
                break;
            }

        }

    }
}
