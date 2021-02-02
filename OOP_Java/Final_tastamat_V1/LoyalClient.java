package OOP_Java.Final_tastamat;

import java.util.ArrayList;

public class LoyalClient extends Client{
    private double cashback = 10;
    private double discount = 10;

    public LoyalClient(int id, String name, String surname, ArrayList<Order> orders) {
        super(id, name, surname, orders);
    }

    @Override
    public double getTotalPrice(double totalPrice) {
        return totalPrice - ( ((totalPrice / 100) * discount) - ((totalPrice / 100) * cashback) );
    }

    @Override
    public String getClientData() {
        return "Loyal client, id: " + getId() + ", " + getName() + " " + getSurname() + ", cashback: " + cashback + "%";
    }
}