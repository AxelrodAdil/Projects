package OOP_Java.EventAbstract;

    public class Corporative extends Event{
    private int countOdArtist,countOfMuzician;

    public Corporative(){
    }

    public Corporative(int countOfPeople, String location, double rentalPrice, int countOdArtist, int countOfMuzician) {
        super(countOfPeople, location, rentalPrice);
        this.countOdArtist = countOdArtist;
        this.countOfMuzician = countOfMuzician;
    }

        @Override
        public double PriceOfProduct() {
            return (getCountOfPeople() + countOdArtist + countOfMuzician) * 10000;
        }

        @Override
        public double totalPriceEvent() {
            return countOfMuzician + 30000 + countOdArtist + 60000 + PriceOfProduct() + getRentalPrice();
        }

        @Override
        public String evenData() {
            return super.evenData() + ", count of musician: " + countOfMuzician + ", count of artists: " + countOdArtist;
        }
    }
