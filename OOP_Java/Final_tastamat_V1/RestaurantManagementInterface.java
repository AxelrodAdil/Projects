package OOP_Java.Final_tastamat;

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