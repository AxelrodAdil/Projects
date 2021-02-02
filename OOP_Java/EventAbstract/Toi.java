package OOP_Java.EventAbstract;

public class Toi extends Event {
    private int countOfMusician,countOfTamada,countOfMagician,countOfDancer;

    public Toi(){
    }

    @Override
    public double PriceOfProduct() {
        return (getCountOfPeople() + countOfDancer + countOfMagician + countOfTamada + countOfMusician);
    }

    @Override
    public double totalPriceEvent() {
        return PriceOfProduct() + getRentalPrice() + countOfMusician + 50000 + countOfTamada + 70000 + countOfMagician + 7000 + countOfDancer + 5000;
    }

    @Override
    public String evenData() {
        return super.evenData() + ", Count of musician: " + countOfMusician + ", Count of tamada" + countOfTamada + ", Count of magician: " + countOfMagician + ", Count of dancer:" + countOfDancer;
    }

    public Toi(int countOfPeople, String location, double rentalPrice, int countOfMusician, int countOfTamada, int countOfMagician, int countOfDancer) {
        super(countOfPeople, location, rentalPrice);
        this.countOfMusician = countOfMusician;
        this.countOfTamada = countOfTamada;
        this.countOfMagician = countOfMagician;
        this.countOfDancer = countOfDancer;
    }
}
