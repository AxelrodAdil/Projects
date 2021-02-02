package OOP_Java.RM2;

import java.util.ArrayList;

public class Client {
    private int id;
    private String name;
    private String surname;
    private ArrayList<Order> orderHistory = new ArrayList<>();

    Client(int id, String name, String surname){
        setId(id);
        setName(name);
        setSurname(surname);
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addOrder(Order order){
        orderHistory.add(order);
    }
}