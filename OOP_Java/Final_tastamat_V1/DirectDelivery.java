package OOP_Java.Final_tastamat;

public class DirectDelivery extends DeliverySystem {
    private String city;
    private String streetName;
    private int houseNumber;
    private int flatNumber;

    public DirectDelivery(int orderId_, int clientId_, int invoiceNumber_, String city_, String streetName_, int houseNumber_, int flatNumber_){
        super(orderId_, clientId_, invoiceNumber_);
        this.city = city_;
        this.streetName = streetName_;
        this.houseNumber = houseNumber_;
        this.flatNumber = flatNumber_;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getCity() {
        return city;
    }

    public String getStreetName() {
        return streetName;
    }
}