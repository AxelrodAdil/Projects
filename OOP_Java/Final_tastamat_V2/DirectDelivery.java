package OOP_Java.ISFINAL;

public class DirectDelivery  extends DeliverySystem{
    private String city;
    private String streetName;
    private int houseNumber;
    private int flatNumber;

    public DirectDelivery(int orderid, int clientid, int invoiceNumber, String city, String streetName, int houseNumber, int flatNumber) {
        super(orderid, clientid, invoiceNumber);
        this.city = city;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    @Override
    public String toString() {
        return super.toString() + ", city" +getCity() + ", streetName: " + getStreetName() + ", houseNumber: " + getHouseNumber() + ", flatNumber: " + getFlatNumber();
    }
}
