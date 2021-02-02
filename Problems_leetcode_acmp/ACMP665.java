package Solutions;

import java.util.Scanner;

public class ACMP665 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        sc.useDelimiter("(\\s|[:])+");
        int h = sc.nextInt();
        int m = sc.nextInt();
        int dm = h * 60 + m;
        while (true) {
            dm = (dm+1)%(24*60);
            int q = dm / 60;
            int w = dm % 60;
            int h1 = q / 10;
            int h2 = q % 10;
            int m1 = w / 10;
            int m2 = w % 10;
            if (h1 == m2 && h2 == m1) {
                System.out.println(""+h1 + h2 + ":" + m1 + m2);
                return;
            }
        }
    }
}