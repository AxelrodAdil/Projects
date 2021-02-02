package Problems_leetcode_acmp;

import java.util.Scanner;

public class acmp_398 {
    /**
     * on 20.11.2020, 16:47
     * Задано натуральное число x. Найдите число способов представить его в виде
     * суммы четырех натуральных чисел: x = a + b + c + d, где a ≤ b ≤ c ≤ d.
     * (1 ≤ x ≤ 1500).
     *
     * ~10^8 operations in second
     */
    public static final Scanner sc = new Scanner(System.in);

    void solveMethod() {
        int x = sc.nextInt();
        int count = 0;
        // ~x^2
        for (int a = 1; 4*a<=x; a++) {
            for (int b = a; a + 3 * b <= x; b++) {
                count += (x-a-b)/2-b+1;
            }
        }

        /*
        int d;
        // ~x^3/3! / 4!
        for (int a = 1; 4*a<=x; a++) {
            for (int b = a; a + 3 * b <= x; b++) {
                for (int c = b; a + b + 2 * c <= x; c++) {
                    d = x - (a + b + c);
                    if (a + b + c + d == x) {
                        count++;
                    }
                }
            }
        }*/

        System.out.println(count);
    }

    public static void main(String[] args) {
        new acmp_398().solveMethod();
    }
}
