package OOP_Java.Final_tastamat;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class RestaurantManagement implements RestaurantManagementInterface{
    private ArrayList<Client> clients;
    private ArrayList<Order> orders;
    private ArrayList<Product> products;
    private ArrayList<OrderProducts> orderProducts;

    public void addClient(){
        System.out.print("Client name: ");
        String name = main.sc.next(), surname;
        System.out.print("Surname: ");
        surname = main.sc.next();
        clients.add(new OrdinaryClient(clients.size() + 1, name, surname, new ArrayList<>()));
        System.out.println("Client has been registered!\n" + clients.get(clients.size() - 1).getClientData());
    }

    public void addProduct(){
        System.out.print("Product name: ");
        String productName = main.sc.next();
        System.out.print("Price: ");
        double price = Double.parseDouble(main.sc.next());
        System.out.print("Amount: ");
        int amount = main.sc.nextInt();
        products.add(new Product(products.size() + 1, productName, price));
        orderProducts.add(new OrderProducts(products.size(), amount));
    }

    public void clientsList(){
        for(Client i : clients)
            System.out.println(i.getClientData());
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

    public void productList(){
        for(OrderProducts i : orderProducts){
            for(Product j : products){
                if(i.getId() == j.getId()){
                    System.out.println(j + ", amount: " + i.getQuantity());
                }
            }
        }
    }

    public boolean checkClientId(int id){
        return id > 0 && id <= clients.size();
    }
    public Client getClientData(int id){
        return clients.get(id);
    }

    public void increaseAmountOfProducts(){
        System.out.print("Product id: ");
        int productId = main.sc.nextInt();

        if(productId < 1 || productId > products.size()){
            System.out.println("Product with this id doesn't exists!");
        }else {
            productId--;
            System.out.print(products.get(productId) + ", amount: " + orderProducts.get(productId).getQuantity() + "\nAmount: ");
            int amount = main.sc.nextInt();
            orderProducts.get(productId).setQuantity(orderProducts.get(productId).getQuantity() + amount);
        }
    }

    public void  delivery_void (int id){
        System.out.printf("%n%s%n%s     %s   ", "Direct or Tastamat?", "[1] Direct", "[2] Tastamat");
        int temp_line87_deliveryVoid = main.sc.nextInt();
        if (temp_line87_deliveryVoid == 1){
            DirectDelivery directDelivery = new DirectDelivery(1, 1, 700215, "Astana", "Imanov", 10, 45);
            try {
                Client client = clients.get(id);
                ArrayList<Order> orders = client.getOrders();

                StringBuilder sb = new StringBuilder();
                for(Order i : orders){
                    sb.append("\nTotal price: " + i.getTotalPrice() + ", products: \n");
                    for(OrderProducts j : i.getProductIds()){
                        sb.append(products.get(j.getId() - 1) + ", amount: " + j.getQuantity() + "\n");
                    }
                    sb.append("*****************************\n");
                }


                sb.append(directDelivery.getCity()+"\n");
                sb.append(directDelivery.getStreetName()+"\n");
                sb.append(directDelivery.getHouseNumber()+"\n");
                sb.append(directDelivery.getFlatNumber() + "\n");
                BufferedWriter bwr = new BufferedWriter(new FileWriter(new File("receipt.txt")));
                bwr.write(sb.toString());
                bwr.flush();  //flush the stream
                bwr.close();  //close the stream
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        } else if (temp_line87_deliveryVoid == 2){
            // DeliverySystem deliverySystem = new TastamatDelivery();


        }
    }

    public void calculateTotalPrice(Order order, int id){
        System.out.println("\n\ncalculateTotalPrice");
        try {
            Client client = clients.get(id);
            ArrayList<Order> orders = client.getOrders();
            File myObj = new File("receipt.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }

            StringBuilder sb = new StringBuilder();
            for(Order i : orders){
                sb.append("\nTotal price: " + i.getTotalPrice() + ", products: \n");
                System.out.println("Total price: " + i.getTotalPrice() + ", products: ");
                for(OrderProducts j : i.getProductIds()){
                    sb.append(products.get(j.getId() - 1) + ", amount: " + j.getQuantity() + "\n");
                    System.out.println(products.get(j.getId() - 1) + ", amount: " + j.getQuantity());
                }
                sb.append("*****************************\n");
                System.out.println("*****************************");
            }
            /*
             * To write contents of StringBuffer to a file, we use
             * BufferedWriter class.
             */
            BufferedWriter bwr = new BufferedWriter(new FileWriter(new File("receipt.txt")));
            bwr.write(sb.toString());
            bwr.flush();  //flush the stream
            bwr.close();  //close the stream
            System.out.println("Successfully wrote to the file.");


            System.out.printf("%n%s%n%s    %s   ", "Delivery?", "[1] Yes", "[2] No");
            int temp_choice_delivery = main.sc.nextInt();
            if (temp_choice_delivery == 1){
                delivery_void(id);
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void makeAnOrder(int id){
        byte make_Menu = -1;
        Order order = new Order(id + 1, new ArrayList<>(), 0);
        while (make_Menu != 0 && make_Menu != 2){
            System.out.printf("%n%s%n%s%n%s%n%s%n", "[1] List of products", "[2] Buy " + order.getTotalPrice(), "[3] Add product", "[0] Cancel and back");
            make_Menu = main.sc.nextByte();

            switch (make_Menu){
                case 1:{
                    productList();
                    break;
                }
                case 2:{
                    this.orders.add(order);
                    clients.get(id).getOrders().add(order);
                    if (clients.get(id).getOrders().size() >= 5) {
                        clients.set(id, new PrimeClient(id + 1, clients.get(id).getName(), clients.get(id).getSurname(), clients.get(id).getOrders()));
                    } else if (clients.get(id).getOrders().size() >= 11) {
                        clients.set(id, new LoyalClient(id + 1, clients.get(id).getName(), clients.get(id).getSurname(), clients.get(id).getOrders()));
                    }
                    calculateTotalPrice(order, id);
                    break;
                }
                case 3:{
                    System.out.print("Product id: ");
                    int product_Id = main.sc.nextInt();
                    if(product_Id < 1 || product_Id > this.products.size()){
                        System.out.println("Order is impossible!");
                    }else{
                        System.out.print("Amount: ");
                        int amount = main.sc.nextInt();
                        if(amount > this.orderProducts.get(product_Id - 1).getQuantity() || amount == 0){
                            System.out.println("Order is impossible!");
                        }else{
                            order.getProductIds().add(new OrderProducts(product_Id, amount));
                            orderProducts.get(product_Id - 1).setQuantity(orderProducts.get(product_Id - 1).getQuantity() - amount);
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

    public RestaurantManagement(ArrayList<Product> products, ArrayList<Client> clients, ArrayList<Order> orders, ArrayList<OrderProducts> orderProducts) {  // OnlineStoreManagement.java class
        this.products = products;
        this.clients = clients;
        this.orders = orders;
        this.orderProducts = orderProducts;
    }
}