package OOP_Java.Final_tastamat;

public abstract class DeliverySystem {
    private int orderId;
    private int clientId;
    private int invoiceNumber;

    public DeliverySystem (int orderId_, int clientId_, int invoiceNumber_){
        this.orderId = orderId_;
        this.clientId = clientId_;
        this.invoiceNumber = invoiceNumber_;
    }
}