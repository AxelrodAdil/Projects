package Solutions;

import java.util.Scanner;
/*
n=4:
 1  2  3  4
 5  6  7  8
 9 10 11 12
13 14 15 16

n=3:
 1  2  3
 4  5  6
 7  8  9
 */

public class Spiral1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = 1 + n * i + j;
                System.out.printf("%2d ", a[i][j]);
            }
            System.out.println();
        }
        System.out.println("---------------------");
        for (int i = n-1, j = 0; i > 0; i--, j++) {
            for (int k = j; k < i; k++)
                System.out.print(a[j][k]);
            for (int k = j; k < i; k++)
                System.out.print(a[k][i]);
            for (int k = i; k > j; k--)
                System.out.print(a[i][k]);
            for (int k = i; k > j; k--)
                System.out.print(a[k][j]);
        }

        // special case for middle element if n is odd
        if (n % 2 != 0)
            System.out.print(a[(n-1)/2][(n-1)/2]);
    }
}