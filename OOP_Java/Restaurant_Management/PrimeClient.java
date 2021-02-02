package OOP_Java.Restaurant_Management;

import java.util.ArrayList;

/**
 * Created by Adil
 * on 30.10.2020, 10:15.
 */
public class PrimeClient extends Client{
    private int discount = 5;

    public PrimeClient(int id, String name, String surname, ArrayList<Order> orders) {
        super(id, name, surname, orders);
    }

    @Override
    public double getTotalPrice(double totalPrice) {
        return totalPrice - ((totalPrice / 100) * discount);
    }

    @Override
    public String getClientData() {
        return "Prime client, id: " + getId() + ", " + getName() + " " + getSurname() + ", discount: " + discount + "%";
    }
}
