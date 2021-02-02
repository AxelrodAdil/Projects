package PLaT;

import java.util.Scanner;

public class W6_array13 {
    static Scanner sc = new Scanner(System.in);
/*
4
-100 101 51 -21
 */
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arrA = new int[n];
        for (int i = 0; i < n; i++) {
            // arrA[i] = (Math.random() * 1000);
            arrA[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arrA[i] < min && arrA[i] > 0) { min = arrA[i]; }
            if (arrA[i] > max && arrA[i] < 0) { max = arrA[i]; }
        }

        if (min > Math.abs(max)){ System.out.println("0den ulken: " + min); }
        else if (min < Math.abs(max)){ System.out.println("0den kiwi: " + max); }
    }
}