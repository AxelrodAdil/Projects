package OOP_Java.ISFINAL;

import java.util.Date;

public class Payment {

    private int id;
    private int clientid;
    private int orderid;
    private Date date;
    private boolean Status;
    private double ordertotalPrice;

    public void calculatePayment() {}

    public Payment(int id, int clientid, int orderid, Date date, boolean status, double ordertotalPrice) {
        this.id = id;
        this.clientid = clientid;
        this.orderid = orderid;
        this.date = date;
        Status = status;
        this.ordertotalPrice = ordertotalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClientid() {
        return clientid;
    }

    public void setClientid(int clientid) {
        this.clientid = clientid;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    public double getOrdertotalPrice() {
        return ordertotalPrice;
    }

    public void setOrdertotalPrice(double ordertotalPrice) {
        this.ordertotalPrice = ordertotalPrice;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", clientid=" + clientid +
                ", orderid=" + orderid +
                ", date=" + date +
                ", Status=" + Status +
                ", ordertotalPrice=" + ordertotalPrice +
                '}';
    }
}
