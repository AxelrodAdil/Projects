package OOP_Java.Final_tastamat;

import java.util.ArrayList;

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