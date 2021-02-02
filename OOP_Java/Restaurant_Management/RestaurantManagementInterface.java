package OOP_Java.Restaurant_Management;

/**
 * Created by Adil
 * on 30.10.2020, 10:26.
 */
public interface RestaurantManagementInterface {
    void addClient();
    void clientsList();
    void productList();
    void addProduct();
    void increaseAmountOfProducts();
    boolean checkClientId(int id);
    Client getClientData(int id);
    void printClientsOrders(int id);
    void makeAnOrder(int id);
}
