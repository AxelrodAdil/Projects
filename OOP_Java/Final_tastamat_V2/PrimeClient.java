package OOP_Java.ISFINAL;

import java.util.ArrayList;

public class PrimeClient extends Client{
    private int discount;

    public PrimeClient() {
    }
    public PrimeClient(int id, String name, String surname, ArrayList<Order> orderHistory, int discount) {
        super(id, name, surname, orderHistory);
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String toString() {
        return "\nPrime Client: " + " ID: " + getId() + " Name: " + getName() + " Surname: " + getSurname() + " Order History: " + getOrderHistory() + " Discount: " + discount;
    }
}
