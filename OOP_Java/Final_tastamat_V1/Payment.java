package OOP_Java.Final_tastamat;

import java.util.Date;

public class Payment{
    private int id;
    private int clientId;
    private int orderId;
    private Date date;
    private double orderTotalPrice;
    private static boolean status = false;

    public Payment(){}

    public Payment(int id_, int clientId_, int orderId_, Date date_, double orderTotalPrice){
        this.id = id_;
        this.clientId = clientId_;
        this.orderId = orderId_;
        this.date = date_;
        this.orderTotalPrice = orderTotalPrice;
    }

    public void calculatePayment(){
        // RM 81_line
    }
}