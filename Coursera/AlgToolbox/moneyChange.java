package Coursera.AlgUCSanDiego.AlgToolbox;

import java.util.Scanner;

public class moneyChange {

    void changeNUMmoney(int n) {
        int[] coins = { 10, 5, 1 };
        int count = 0;

        for (int i = 0; n > 0; i++) {
            count += n / coins[i];
            n %= coins[i];
        }
        System.out.println(count);
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        changeNUMmoney(n);
    }

    void run() {
        try (Scanner sc = new Scanner(System.in)) {
            solve(sc);
        }
    }

    public static void main(String[] args) {
        new moneyChange().run();
    }
}