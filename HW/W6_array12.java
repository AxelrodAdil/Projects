package PLaT;

import java.util.Scanner;

public class W6_array12 {
    static Scanner sc = new Scanner(System.in);

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
            if (arrA[i] > max && arrA[i] > 0) { max = arrA[i]; }
            if (arrA[i] < min && arrA[i] < 0) { min = arrA[i]; }
        }

        if (max > Math.abs(min)){ System.out.println("Max: " + max); }
        else if (max < Math.abs(min)){ System.out.println("Min: " + min); }
    }
}