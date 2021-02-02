package Adil_Sept.AdilCheatsJava;

import java.util.Scanner;

public class PLaT_3W_11 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int m = sc.nextInt(), n = sc.nextInt();
        if (m < 0) { m = m*(-1);
        } else if (n < 0) { n = n*(-1); }

        for (int i = 1; i <= n && i <= m; ++i) {
            if (n % i == 0 && m % i == 0) System.out.println(i);
        }

        System.out.println();
    }
}