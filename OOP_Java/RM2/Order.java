package OOP_Java.RM2;

import java.util.ArrayList;

public class Order {
    private int clientId;
    private ArrayList<OrderProducts> productIds = new ArrayList<>();
    private double totalPrice = 0;

    Order(int clientId){
        setClientId(clientId);
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public void addOrderProducts(OrderProducts orderProducts, RestaurantManagement restaurantManagement){
        productIds.add(orderProducts);
        totalPrice += (restaurantManagement.getPriceById(orderProducts.getProductId()) * orderProducts.getQuantity());
    }
}
