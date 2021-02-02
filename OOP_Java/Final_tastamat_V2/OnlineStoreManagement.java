package OOP_Java.ISFINAL;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class OnlineStoreManagement {
    private ArrayList<Product> productArrayList;
    private ArrayList<Client> clientArrayList;
    private ArrayList<Order> orderArrayList;

    private int pID = 0;
    private int cID = 0;
    private int oID = 0;
    private int payID = 0;

    public OnlineStoreManagement(ArrayList<Product> products, ArrayList<Client> clients, ArrayList<Order> orders) {
        this.productArrayList = products;
        this.clientArrayList = clients;
        this.orderArrayList = orders;
    }

    public ArrayList<Product> getProductArrayList() {
        return productArrayList;
    }
    public void setProductArrayList(ArrayList<Product> productArrayList) {
        this.productArrayList = productArrayList;
    }
    public ArrayList<Client> getClientArrayList() {
        return clientArrayList;
    }
    public void setClientArrayList(ArrayList<Client> clientArrayList) {
        this.clientArrayList = clientArrayList;
    }
    public ArrayList<Order> getOrderArrayList() {
        return orderArrayList;
    }
    public void setOrderArrayList(ArrayList<Order> orderArrayList) {
        this.orderArrayList = orderArrayList;
    }

    public void addProducts(Product p){
        productArrayList.add(p);
        pID++;
    }
    public void addClient(Client c){
        clientArrayList.add(c);
        cID++;
    }
    public void addOrder(Order o){
        orderArrayList.add(o);
        oID++;
    }

    public String makeOrders(int id){
        Scanner in = new Scanner(System.in);
        boolean check = false;
        for(Client c : clientArrayList){
            if (c.getId() == id) {
                check = true;
                break;
            }
        }
        if(!check){
            return "Client has not been detected!";
        }
        else {
            listProducts();
            System.out.print("Choose the Product ID: ");
            int id1 = in.nextInt();
            int quantity = 0;

            while(true) {
                System.out.println(productArrayList.get(id1-1).getAmountInStock());
                System.out.print("INSERT the quantity: ");
                quantity = in.nextInt();
                if (quantity > productArrayList.get(id1-1).getAmountInStock()) {
                    System.out.println("Not enough products");
                }
                else break;
            }

            double priceOfProduct = productArrayList.get(id1-1).getPrice();


            if (clientArrayList.get(id-1) instanceof PrimeClient) {
                priceOfProduct = discountPrime(priceOfProduct, (PrimeClient) clientArrayList.get(id-1));

                ArrayList<OrderProducts> op1 = new ArrayList<>();

                op1.add(new OrderProducts(id1, priceOfProduct, quantity));

                double totalPrice = 0;
                for(OrderProducts op : op1){
                    totalPrice += op.getQuantity()*op.getPriceOfProduct();
                }
                orderArrayList.add(new Order(oID, id-1, op1, totalPrice));

                ArrayList<Order> o = new ArrayList<>();
                o.addAll(clientArrayList.get(id-1).getOrderHistory());
                o.add(new Order(oID++, id-1, op1, totalPrice));

                PrimeClient pc = new PrimeClient(clientArrayList.get(id-1).getId(), clientArrayList.get(id-1).getName(), clientArrayList.get(id-1).getSurname(), o, ((PrimeClient) clientArrayList.get(id-1)).getDiscount());
                clientArrayList.remove(id-1);
                clientArrayList.add(pc);
                Paymant(pc);
                return "Order is accepted!";
            }
            else if(clientArrayList.get(id-1) instanceof LoyalClient) {
                priceOfProduct = discountLoyal(priceOfProduct, (LoyalClient) clientArrayList.get(id-1));

                ArrayList<OrderProducts> op1 = new ArrayList<>();

                op1.add(new OrderProducts(id1, priceOfProduct, quantity));

                double totalPrice = 0;
                for(OrderProducts op : op1){
                    totalPrice += op.getQuantity()*op.getPriceOfProduct();
                }
                orderArrayList.add(new Order(oID, id-1, op1, totalPrice));

                ArrayList<Order> o = new ArrayList<>();
                o.addAll(clientArrayList.get(id-1).getOrderHistory());
                o.add(new Order(oID++, id, op1, totalPrice));

                LoyalClient pc = new LoyalClient(clientArrayList.get(id-1).getId(), clientArrayList.get(id-1).getName(), clientArrayList.get(id-1).getSurname(), o, ((LoyalClient) clientArrayList.get(id-1)).getDiscount(), ((LoyalClient) clientArrayList.get(id-1)).getCashback());
                clientArrayList.remove(id-1);
                clientArrayList.add(pc);
                Paymant(pc);
                return "Order is accepted!";
            }
            else {
                ArrayList<OrderProducts> op1 = new ArrayList<>();

                op1.add(new OrderProducts(id1, priceOfProduct, quantity));

                double totalPrice = 0;
                for(OrderProducts op : op1){
                    totalPrice += op.getQuantity()*op.getPriceOfProduct();
                }
                orderArrayList.add(new Order(oID, id-1, op1, totalPrice));

                ArrayList<Order> o = new ArrayList<>();
                o.addAll(clientArrayList.get(id-1).getOrderHistory());
                o.add(new Order(oID++, id-1, op1, totalPrice));

                OrdinaryClient pc = new OrdinaryClient(clientArrayList.get(id-1).getId(), clientArrayList.get(id-1).getName(), clientArrayList.get(id-1).getSurname(), o);
                clientArrayList.remove(id-1);
                clientArrayList.add(pc);
                Paymant(pc);
                return "Order is accepted!";
            }
        }
    }

    public double discountPrime(double p, PrimeClient c){
        return p*((100-c.getDiscount())/100.0);
    }

    public double discountLoyal(double p, LoyalClient c){
        return p*((100-(c.getCashback() + c.getDiscount())) / 100.0);
    }

    public void Paymant(Client c){
        try{
            FileWriter fw = new FileWriter("receive.txt");
            String txt = "";
            double price = 0;
            for (Order o: c.getOrderHistory()){
                price = o.getTotalPrice();
                for(OrderProducts op: o.getProductIds()){
                    for(Product p: productArrayList){
                        if(p.getId() == op.getProductId()){
                            txt += p.getName() + " ";
                        }
                    }
                }
            }
            fw.write(price + " ");
            fw.write(txt);
            fw.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public void listProducts() {
        System.out.println("Products: " + productArrayList);
    }
    public void listClients() {
        System.out.println("Clients: " + clientArrayList);
    }
    public void listOrders() {
        System.out.println("Orders: " + orderArrayList);
    }


    public void removeProducts(int id){
        productArrayList.remove(id);
    }
    public void removeClient(int id){
        clientArrayList.remove(id);
    }
    public void removeOrder(int id){
        orderArrayList.remove(id);
    }

    public void updateProduct(int id){
        Scanner in = new Scanner(System.in);

        System.out.print("Name: ");
        String name = in.next();
        System.out.print("Price: ");
        double price =  in.nextDouble();
        System.out.print("Amount in Stock: ");
        int amount =  in.nextInt();
        Product p = new Product(id, name, price, amount);
        productArrayList.remove(id);
        productArrayList.add(p);
    }
    public void updateClient(int id){
        Scanner in = new Scanner(System.in);

        System.out.print("Name: ");
        String name = in.next();
        System.out.print("Surname: ");
        String surname = in.next();
        if(clientArrayList.get(id) instanceof  OrdinaryClient){
            OrdinaryClient client = new OrdinaryClient(id, name, surname, clientArrayList.get(id).getOrderHistory());
            clientArrayList.remove(id);
            clientArrayList.add(client);
        }
        else if(clientArrayList.get(id) instanceof  PrimeClient){
            System.out.print("Discount: ");
            int discount = in.nextInt();
            PrimeClient client = new PrimeClient(id, name, surname, clientArrayList.get(id).getOrderHistory(), discount);
            clientArrayList.remove(id);
            clientArrayList.add(client);
        }
        else if(clientArrayList.get(id) instanceof  LoyalClient){
            System.out.print("Discount: ");
            int discount = in.nextInt();
            System.out.print("CashBack: ");
            int cashback = in.nextInt();
            LoyalClient client = new LoyalClient(id-1, name, surname, clientArrayList.get(id).getOrderHistory() , discount, cashback);
            clientArrayList.remove(id);
            clientArrayList.add(client);
        }
        System.out.println("Succesfully updated");
    }
}
