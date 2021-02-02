package Adil_Sept.AdilCheatsJava;

import java.util.Scanner;

public class PLaT_3W_14 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt(), x = sc.nextInt();
        int sum = 0;
        for(int k = 1; k <= n; ++k){
            sum += Math.pow(k,k) * Math.pow(x,2*k);
        }
        System.out.println(sum);
    }
}
