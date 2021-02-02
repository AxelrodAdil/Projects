package Problems_leetcode_acmp;

import java.util.Scanner;

public class acmp_383 {
    /**
     * on 20.11.2020, 15:56
     * Будем называть число красивым, если сумма его цифр в десятичной системе счисления
     * делится на количество цифр в нем (в десятичной системе счисления).
     * Необходимо найти N-ое в порядке возрастания красивое число. (1 ≤ N ≤ 100 000)
     */
    public static final Scanner sc = new Scanner(System.in);

    int digitsSum(int n) {
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }

    int digitsCount(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }


    void solveMethod() {
        int x = sc.nextInt();
        int count = 0;
        int cur = 1;
        while (true) {
            if (digitsSum(cur) % digitsCount(cur) == 0) {
                count++;
                if (count == x) {
                    System.out.println(cur);
                    return;
                }
            }
            cur++;
        }
    }

    public static void main(String[] args) {
        new acmp_383().solveMethod();
    }
}