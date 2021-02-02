package OOP_Java.Restaurant_Management;

/**
 * Created by Adil
 * on 30.10.2020, 10:15.
 */
public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", " + name + ", price: " + price + "KZT";
    }
}
