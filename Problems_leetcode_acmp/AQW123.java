import java.util.Scanner;

public class AQW123 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double x = 1.23;
        double y = 15.4;
        double z = 252;
        double needSqrt = 3;
        int g = (int)(Math.pow(y, x + 1) / (Math.pow(Math.abs(y - 2),2/needSqrt) + 3) + ((x + y / 2) / 2 * Math.abs(x + y)) * Math.pow(x + 1, -1 / Math.sin(z)));
        System.out.println(g);
    }
}