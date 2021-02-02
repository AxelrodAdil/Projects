package OOP_Java.ISFINAL;

import java.util.ArrayList;

public class OrdinaryClient extends Client{
    public OrdinaryClient(int id, String name, String surname, ArrayList<Order> orderHistory) {
        super(id, name, surname, orderHistory);
    }

    public String toString() {
        return "\nOrdinary Client: " + " ID: " + getId() + " Name: " + getName() + " Surname: " + getSurname() + " Order History: " + getOrderHistory();
    }
}
