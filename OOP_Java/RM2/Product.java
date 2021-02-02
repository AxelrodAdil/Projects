package OOP_Java.RM2;

public class Product {
    private int id;
    private String name;
    private double price;

    Product(int id, String name, double price){
        setId(id);
        setName(name);
        setPrice(price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
