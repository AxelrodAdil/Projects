package OOP_Java.EventAbstract;

public abstract class Event {
    private int countOfPeople;
    private String location;
    private double rentalPrice;

    public Event() {
    }

    public Event(int countOfPeople, String location, double rentalPrice) {
        this.countOfPeople = countOfPeople;
        this.location = location;
        this.rentalPrice = rentalPrice;
    }

    public int getCountOfPeople() {
        return countOfPeople;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public String evenData() {
        return "People:" + countOfPeople + "Loacation, " + location + "rentalPrice;" + rentalPrice;
    }

    abstract public double PriceOfProduct();

    abstract public double totalPriceEvent();
}