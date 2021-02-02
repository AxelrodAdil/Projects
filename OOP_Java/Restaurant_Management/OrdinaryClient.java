package OOP_Java.Restaurant_Management;

import java.util.ArrayList;

/**
 * Created by Adil
 * on 30.10.2020, 10:15.
 */
public class OrdinaryClient extends Client{

    public OrdinaryClient(int id, String name, String surname, ArrayList<Order> orders) {
        super(id, name, surname, orders);
    }

    @Override
    public double getTotalPrice(double totalPrice) {
        return totalPrice;
    }

    @Override
    public String getClientData() {
        return "Ordinary client, id: " + getId() + ", " + getName() + " " + getSurname();
    }
}
