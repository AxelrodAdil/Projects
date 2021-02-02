package Adil_Sept.AdilCheatsJava;

import java.util.Scanner;

public class PLaT_3W_15 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double b; b = sc.nextDouble();
        double c,a; c = sc.nextDouble();
        int count = 0;
        for(int i = 1; i <= 10; ++i){
            a = sc.nextDouble();
            if(c < b && c < a) count ++;
            b = c;
            c = a;
        }
        System.out.println(count);
    }
}
