package Adil_Sept.AdilCheatsJava;

import java.util.Scanner;

public class PLaT_3W_6 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double b = sc.nextDouble();
        double c = sc.nextDouble(), a;
        int count = 0;
        for (int i = 1; i <= 200; ++i) {
            a = sc.nextDouble();
            if (c > b && c > a) count++;
            b = c;
            c = a;
        }
        System.out.println(count);
    }
}
