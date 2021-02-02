package OOP_Java.Final_tastamat;

import java.util.ArrayList;

public abstract class Client {
    private int id;
    private String name, surname;
    private ArrayList<Order> orders;

    public Client(int id, String name, String surname, ArrayList<Order> orders) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    abstract public double getTotalPrice(double totalPrice);
    abstract public String getClientData();
}