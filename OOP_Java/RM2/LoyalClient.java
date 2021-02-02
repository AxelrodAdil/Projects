package OOP_Java.RM2;

public class LoyalClient extends Client {
    private double cashback = 0.05;

    LoyalClient(int id, String name, String surname){
        super(id, name, surname);
    }
}
