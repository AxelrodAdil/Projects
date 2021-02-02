package Adil_Sept.AdilCheatsJava;

import java.util.Scanner;

public class PLaT_3W_10 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        double max = sc.nextDouble(), a;
        for(int i = 2; i <= n; ++i){
            a = sc.nextDouble();
            if(a < 0 && a > max) max = a;
        }
        System.out.println(max);
    }
}
