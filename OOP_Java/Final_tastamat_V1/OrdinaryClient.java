package OOP_Java.Final_tastamat;

import java.util.ArrayList;

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