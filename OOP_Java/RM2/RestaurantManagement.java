package OOP_Java.RM2;

import java.util.ArrayList;

public class RestaurantManagement {
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Client> clients = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();

    public ArrayList<OrdinaryClient> ordinaryClients = new ArrayList<>();
    public ArrayList<PrimeClient> primeClientsList = new ArrayList<>();
    public ArrayList<LoyalClient> loyalClientsList = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void addOrdinaryArrayList (OrdinaryClient ordinaryClient){
        ordinaryClients.add(ordinaryClient);
    }
    public void addPrimeArrayList (PrimeClient primeClient){
        primeClientsList.add(primeClient);
    }
    public void addLoyalArrayList (LoyalClient loyalClient){
        loyalClientsList.add(loyalClient);
    }

    public void addClient (Client client){
        clients.add(client);
    }

    public void ArrayListCopy (){
        // code...
    }

    public int getProductAmount(){
        return products.size();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public double getPriceById(int id){
        for (Product product : products){
            if (product.getId() == id){
                return product.getPrice();
            }
        }
        return 0;
    }

    public void addOrder(Order order){
        orders.add(order);
    }
}
