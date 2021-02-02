package Problems_leetcode_acmp;

import java.util.Scanner;

public class acmp_317 {
    /**
     * on 20.11.2020, 17:24
     * Ириска весит X грамм, мандарин – Y грамм, пряник – Z грамм.
     * Требуется написать программу, которая определит, сколько различных вариантов подарков весом ровно W грамм может сделать Дед Мороз.
     * X, Y, Z и W (1 ≤ X,    Y, Z ≤ 100,    1 ≤ W ≤ 1000).
     */
    public static final Scanner sc = new Scanner(System.in);
// контрпример:   1 1 1 1000
// 1 1 1 5
// 10 25 15 40
    void solveMethod() {
        // x, y, z, w
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int w = sc.nextInt();

        int count = 0;
        for (int a = 0; a*x <= w; a++) {
            for (int b = 0; a*x + b*y <= w; b++) {
                if((w - x * a - y * b) % z == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        new acmp_317().solveMethod();
    }
}