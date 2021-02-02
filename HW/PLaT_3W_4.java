package Adil_Sept.AdilCheatsJava;

import java.util.Scanner;

public class PLaT_3W_4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt(), k, m, x = sc.nextInt();
        int sum = 0, res = 0;

        for(k = 1; k <= n; ++k){
            for(m = k; m <= n; ++m){
                sum += (x + k) / m;
            }
            res += sum;
        }
        System.out.println(res);
    }
}
