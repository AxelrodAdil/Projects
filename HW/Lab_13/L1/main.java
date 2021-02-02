package OOP_Java.Lab_13.L1;

public class main {

    /**
     *
     * Created by Adil Myktybek
     * on 13.12.2020, 21:25
     *
     */

    public static void main(String[] args) {
        Tochka abs = new Kvadrat(0, 0, 2, 0, 0, 2, 2, 2);
        System.out.println(abs.getArea());
        System.out.println(abs.getVolume());
        System.out.println("------------------------------------------");
        Cub cub = new Cub(0, 0, 2, 0, 0, 2, 2, 2);
        System.out.println(cub.getVolume());
        System.out.println(cub.getArea());
    }
}