package OOP_Java.ISFINAL;

import java.util.ArrayList;

public class LoyalClient extends Client{
    private int Discount;
    private double cashback;


    public LoyalClient(int discount, double cashback) {
        Discount = discount;
        this.cashback = cashback;
    }

    public LoyalClient(int id, String name, String surname, ArrayList<Order> orderHistory, int discount, double cashback) {
        super(id, name, surname, orderHistory);
        Discount = discount;
        this.cashback = cashback;
    }

    public int getDiscount() {
        return Discount;
    }

    public void setDiscount(int discount) {
        Discount = discount;
    }

    public double getCashback() {
        return cashback;
    }

    public void setCashback(double cashback) {
        this.cashback = cashback;
    }

    public String toString() {
        return "\nLoyal Client: " + " ID: " + getId() + " Name: " + getName() + " Surname: " + getSurname() + " Order History: " + getOrderHistory() + ", discount: " + getDiscount() +  " CashBack: " + cashback;
    }
}
