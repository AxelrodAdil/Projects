package OOP_Java.RM2;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static RestaurantManagement restaurantManagement = new RestaurantManagement();

    public static void main(String[] args) {
        welcomeToProject();
        addClient();
        boolean mainTemp_true_false = true;
        while (mainTemp_true_false){
            int choose = mainMenu();
            System.out.println();
            switch (choose){
                case 1: {
                    System.out.println("Adding product...");
                    addProductMenu();
                    break;
                }
                case 2: {
                    System.out.println("Get Login...");
                    clientActivity();
                    break;
                }
                case 3: {
                    System.out.println("Exit...");
                    System.exit(1);
                    break;
                }
                default:
                    mainTemp_true_false = false;
                    break;
            }
        }
    }

    private static void clientActivity() {
        boolean clientMain_tru_false = true;
        Client client = null;

        if (clientLogging(client)){
            System.out.println("You successfully registered!!!");
        } else {
            System.out.println("You successfully logged");
        }

        while (clientMain_tru_false){
            switch (clientChooseMenu()){
                case 1: {
                    if (client instanceof OrdinaryClient) {
                        System.out.println("I'm ordinary client");
                        makeOrder(client);
                    } else if (client instanceof PrimeClient) {
                        System.out.println("I'm prime client");
                        makeOrder(client);
                    } else if (client instanceof LoyalClient){
                        System.out.println("I'm loyal client");
                        makeOrder(client);
                    }
                    break;
                }
                case 2: {
                    System.out.println("Exit...");
                    System.exit(1);
                    break;
                }
                default:
                    clientMain_tru_false = false;
                    break;
            }
        }
    }

    private static void makeOrder(Client client) {
        if (restaurantManagement.getProductAmount() < 1){
            System.out.println("Sorry, but our menu is empty!");
            System.out.println("Come again later, please.");
        } else if (restaurantManagement.getProductAmount() >= 1){
            Order order = new Order(client.getId());
            int i = 0;
            boolean all = true;
            while (all){
                String productName = restaurantManagement.getProducts().get(i).getName();
                double productPrice = restaurantManagement.getProducts().get(i).getPrice();
                int productId = restaurantManagement.getProducts().get(i).getId();
                System.out.printf(" %d - %s. Price: %.2f$\n", productId, productName, productPrice);
                System.out.print("Quantity: ");
                int quantity = sc.nextInt();
                if (quantity != 0) {
                    OrderProducts orderProducts = new OrderProducts(productId, quantity);
                    order.addOrderProducts(orderProducts, restaurantManagement);
                }

                restaurantManagement.addOrder(order);
                client.addOrder(order);
                System.out.println("zakaz?  [1] yes , [2] no");
                int k = sc.nextInt();
                if (k == 1){
                    all = true;
                } else if (k == 2){
                    all = false;
                }
            }
        }
    }

    private static int clientChooseMenu() {
        System.out.println("\nYour Action");
        System.out.println(" [1] - Make Order");
        System.out.println(" [2] - Exit");
        return (sc.nextInt());
    }

    private static boolean clientLogging(Client client){
        boolean itIsNewClient = true;
        System.out.print("Your name: ");
        String name = sc.next();
        System.out.print("Your surname: ");
        String surname = sc.next();
        
        client = checkingNameSurname(name, surname);
        if (client == null){
            System.out.print("Enter id: ");
            client = new OrdinaryClient(sc.nextInt(), name, surname);
        } else {
            itIsNewClient = false;
        }
        return itIsNewClient;
    }

    private static Client checkingNameSurname(String name, String surname) {
        for (Client curClient: restaurantManagement.getClients()){
            if(curClient.getName().toLowerCase().trim().equals(name.toLowerCase().trim()) && curClient.getSurname().toLowerCase().trim().equals(surname.toLowerCase().trim())) {
                return curClient;
            }
        }
        return null;
    }

    private static void addProductMenu() {
        Scanner StringScanner = new Scanner (System.in);
        String name;
        int id;
        double price;

        System.out.println("-----------------------");
        System.out.print("Enter the product name: ");
        name = StringScanner.nextLine();

        System.out.print("\nEnter the product id: ");
        id = sc.nextInt();

        System.out.print("\nEnter the product price: ");
        price = sc.nextDouble();
        System.out.println("-----------------------");

        restaurantManagement.addProduct(new Product(id, name, price));
    }

    private static int mainMenu() {
        System.out.println("\nYour Action");
        System.out.println(" [1] - Add Product");
        System.out.println(" [2] - I'm Client");
        System.out.println(" [3] - Exit");
        return (sc.nextInt());
    }

    private static void welcomeToProject(){
        System.out.println("Welcome to the Restaurant!!");
    }

    public static void addClient(){
        RestaurantManagement rm = new RestaurantManagement();
        Client ordClient1 = new Client(1, "Nurdaulet", "Zhandos");
        Client ordClient2 = new Client(2, "Sanat", "Tolegen");
        Client ordClient3 = new Client(3, "Amir", "Adil");

        rm.addClient(ordClient1);
        rm.addClient(ordClient2);
        rm.addClient(ordClient3);

        /*OrdinaryClient ordClient1 = new OrdinaryClient(1, "Nurdaulet", "Zhandos");
        PrimeClient ordClient2 = new PrimeClient(2, "Sanat", "Tolegen");
        LoyalClient ordClient3 = new LoyalClient(3, "Amir", "Adil");
        rm.addOrdinaryArrayList(ordClient1);
        rm.addPrimeArrayList(ordClient2);
        rm.addLoyalArrayList(ordClient3);*/

        rm.ArrayListCopy();
    }
}