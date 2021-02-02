package OOP_Java.Lab_13.L6;

public class main {
    public static void main(String[] args) {
        Facultet facultet = new Admin();
        facultet.who_are_u();
        System.out.println("-------------------------");
        Facultet facultet1 = new Prep();
        facultet1.who_are_u();
    }
}
