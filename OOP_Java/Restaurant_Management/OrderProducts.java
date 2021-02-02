package OOP_Java.Restaurant_Management;

/**
 * Created by Adil
 * on 30.10.2020, 10:16.
 */
public class OrderProducts {
    private int id, quantity;

    public OrderProducts(int id, int quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
