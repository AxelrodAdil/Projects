package OOP_Java.Restaurant_Management;
import java.util.ArrayList;

/**
 * Created by Adil
 * on 30.10.2020, 10:15.
 */
public class LoyalClient extends Client{
    private double cashback = 5;


    public LoyalClient(int id, String name, String surname, ArrayList<Order> orders) {
        super(id, name, surname, orders);
    }

    @Override
    public double getTotalPrice(double totalPrice) {
        return totalPrice - ((totalPrice / 100) * cashback);
    }

    @Override
    public String getClientData() {
        return "Loyal client, id: " + getId() + ", " + getName() + " " + getSurname() + ", cashback: " + cashback + "%";
    }
}
