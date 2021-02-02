package PLaT;

import java.util.Scanner;

public class W6_array5 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arrA = new int[n];
        for (int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
            //arrA[i] = (int)(Math.random() * 1000);
        }
        System.out.print("X: ");
        int x = sc.nextInt();

        for (int i = 1; i < n; i++) {
            if (arrA[i-1] <= x && x <= arrA[i]){
                System.out.print("arrA[i-1] <= x && x <= arrA[i] : " + x);
                System.out.println("\ni: " + i);
            }
        }

        System.out.println();
    }
}