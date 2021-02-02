package Adil_Sept.AdilCheatsJava;

import java.util.Scanner;

public class PLaT_3W_5 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        double sum = 0;
        for(double i = 1; i <= n; ++i){
            for(double j = 1; j <= i; ++j){
                sum += (1/(i + 2*j));
            }
        }
        System.out.println(sum);
    }
}
