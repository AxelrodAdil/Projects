package OOP_Java.Restaurant_Management;

import java.util.ArrayList;

/**
 * Created by Adil
 * on 30.10.2020, 10:26.
 */
public class RestaurantManagement implements RestaurantManagementInterface{
    private ArrayList<Product> products;
    private ArrayList<Client> clients;
    private ArrayList<Order> orders;
    private ArrayList<OrderProducts> orderProducts;

    public RestaurantManagement(ArrayList<Product> products, ArrayList<Client> clients, ArrayList<Order> orders, ArrayList<OrderProducts> orderProducts) {
        this.products = products;
        this.clients = clients;
        this.orders = orders;
        this.orderProducts = orderProducts;
    }

    public void addClient(){
        System.out.print("Client name: ");
        String name = Main.scn.next(), surname;
        System.out.print("Surname: ");
        surname = Main.scn.next();
        clients.add(new OrdinaryClient(clients.size() + 1, name, surname, new ArrayList<>()));
        System.out.println("Client has been registered!\n" + clients.get(clients.size() - 1).getClientData());
    }

    public void clientsList(){
        for(Client i : clients)
            System.out.println(i.getClientData());
    }

    public void productList(){
        for(OrderProducts i : orderProducts){
            for(Product j : products){
                if(i.getId() == j.getId()){
                    System.out.println(j + ", amount: " + i.getQuantity());
                }
            }
        }
    }

    public void addProduct(){
        System.out.print("Product name: ");
        String productName = Main.scn.next();
        System.out.print("Price: ");
        double price = Double.parseDouble(Main.scn.next());
        System.out.print("Amount: ");
        int amount = Main.scn.nextInt();
        products.add(new Product(products.size() + 1, productName, price));
        orderProducts.add(new OrderProducts(products.size(), amount));
    }

    public void increaseAmountOfProducts(){
        System.out.print("Product id: ");
        int productId = Main.scn.nextInt();
        if(productId < 1 || productId > products.size()){
            System.out.println("Product with this id doesn't exists!");
        }else {
            productId--;
            System.out.print(products.get(productId) + ", amount: " + orderProducts.get(productId).getQuantity() + "\nAmount: ");
            int amount = Main.scn.nextInt();
            orderProducts.get(productId).setQuantity(orderProducts.get(productId).getQuantity() + amount);
        }
    }

    public boolean checkClientId(int id){
        return id > 0 && id <= clients.size();
    }
    public Client getClientData(int id){
        return clients.get(id);
    }

    public void printClientsOrders(int id){
        Client client = clients.get(id);
        ArrayList<Order> orders = client.getOrders();
        for(Order i : orders){
            System.out.println("Total price: " + i.getTotalPrice() + ", products: ");
            for(OrderProducts j : i.getProductIds()){
                System.out.println(products.get(j.getId() - 1) + ", amount: " + j.getQuantity());
            }
            System.out.println("*****************************");
        }
    }

    public void makeAnOrder(int id){
        byte makeMenu = -1;
        Order order = new Order(id + 1, new ArrayList<>(), 0);
        while (makeMenu != 0 && makeMenu != 2){
            System.out.println("PRESS [1] List of products\nPRESS [2] Buy " + order.getTotalPrice() + "\nPRESS [3] Add product\nPRESS [0] Cancel and back");
            makeMenu = Main.scn.nextByte();
            switch (makeMenu){
                case 1:{
                    productList();
                    break;
                }
                case 2:{
                    if(order.getTotalPrice() > 0) {
                        this.orders.add(order);
                        clients.get(id).getOrders().add(order);
                        if(clients.get(id).getOrders().size() == 11){
                            clients.set(id, new PrimeClient(id + 1, clients.get(id).getName(), clients.get(id).getSurname(), clients.get(id).getOrders()));
                        }
                        else if(clients.get(id).getOrders().size() == 31){
                            clients.set(id, new LoyalClient(id + 1, clients.get(id).getName(), clients.get(id).getSurname(), clients.get(id).getOrders()));
                        }
                    }
                    break;
                }
                case 3:{
                    System.out.print("Product id: ");
                    int productId = Main.scn.nextInt();
                    if(productId < 1 || productId > this.products.size()){
                        System.out.println("Order is impossible!");
                    }else{
                        System.out.print("Amount: ");
                        int amount = Main.scn.nextInt();
                        if(amount > this.orderProducts.get(productId - 1).getQuantity() || amount == 0){
                            System.out.println("Order is impossible!");
                        }else{
                            order.getProductIds().add(new OrderProducts(productId, amount));
                            orderProducts.get(productId - 1).setQuantity(orderProducts.get(productId - 1).getQuantity() - amount);
                            double totalPrice = 0;
                            for(OrderProducts i : order.getProductIds())
                                totalPrice += (products.get(i.getId() - 1).getPrice() * i.getQuantity());
                            order.setTotalPrice(clients.get(id).getTotalPrice(totalPrice));
                        }
                    }
                    break;
                }
                case 0:{
                    for(OrderProducts i : order.getProductIds())
                        orderProducts.get(i.getId() - 1).setQuantity(orderProducts.get(i.getId() - 1).getQuantity() + i.getQuantity());
                    break;
                }
            }
        }
    }
}
