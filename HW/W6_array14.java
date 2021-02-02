package PLaT;

import java.util.Scanner;

public class W6_array14 {
    static Scanner sc = new Scanner(System.in);
/*
7
1 2 3 4 5 6 7
5
9
 */
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arrA = new int[n];
        for (int i = 0; i < n; i++) {
            // arrA[i] = (Math.random() * 1000);
            arrA[i] = sc.nextInt();
        }
        int countA = 0;
        int countB = 0;
        System.out.print("C: ");
        int c = sc.nextInt();
        System.out.print("D: ");
        int d = sc.nextInt();

        for (int i = c; i < d; i++){

            if (!(c <= arrA[i] && arrA[i] <= d)){ countB++; }
        }

        for (int i = 0; i < n; i++) {
            if (c <= arrA[i] && arrA[i] <= d){ countA++; }
            if (arrA[i] < c || arrA[i] > d){ countB++; }
        }

        if (countA > countB){
            System.out.println("\nCountA: " + countA);
        } else {
            System.out.println("CountB: " + countB);
        }
    }
}