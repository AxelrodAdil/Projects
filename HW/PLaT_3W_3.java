package Adil_Sept.AdilCheatsJava;

import java.util.Scanner;

public class PLaT_3W_3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        double p = 1;
        for(double i = 2; i <= n; i += 2){
            System.out.println(p);
            p *= (i/(i+1));
            System.out.println(p);
        }
        System.out.println(p);
        for(double i = 1; i <= n; i += 2){
            p *= ((i+1)/i);
        }
        System.out.println(p);
    }
}
