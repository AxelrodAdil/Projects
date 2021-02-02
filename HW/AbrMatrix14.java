package HW;

import java.util.Scanner;

public class AbrMatrix14 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = n * i + j + 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int c = 0; c < n; c++) {
            for (int i = 0; i<n-c; i++) {
                System.out.print(arr[i][c]+" ");
            }
            for (int j = c+1; j<n; j++) {
                System.out.print(arr[n-c-1][j]+" ");
            }
            System.out.println();
        }
    }
}