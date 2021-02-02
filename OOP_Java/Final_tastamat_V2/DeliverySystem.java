package OOP_Java.ISFINAL;
public  abstract class DeliverySystem {
    private int orderid;
    private int clientid;
    private int invoiceNumber;

    public DeliverySystem(int orderid, int clientid, int invoiceNumber) {
        this.orderid = orderid;
        this.clientid = clientid;
        this.invoiceNumber = invoiceNumber;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public int getClientid() {
        return clientid;
    }

    public void setClientid(int clientid) {
        this.clientid = clientid;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }


}
