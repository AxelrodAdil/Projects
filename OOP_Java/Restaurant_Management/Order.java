package OOP_Java.Restaurant_Management;

import java.util.ArrayList;

/**
 * Created by Adil
 * on 30.10.2020, 10:16.
 */
public class Order {
    private int clientId;
    private ArrayList<OrderProducts> productIds;
    private double totalPrice;

    public Order(int clientId, ArrayList<OrderProducts> productIds, double totalPrice) {
        this.clientId = clientId;
        this.productIds = productIds;
        this.totalPrice = totalPrice;
    }

    public int getClientId() {
        return clientId;
    }

    public ArrayList<OrderProducts> getProductIds() {
        return productIds;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
