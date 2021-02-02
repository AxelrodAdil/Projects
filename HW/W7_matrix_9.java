package PLaT;

import java.util.Scanner;

public class W7_matrix_9 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // matrix[i][j] = sc.nextInt();
                matrix[i][j] = (int) (Math.random() * 100);
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("---------");
        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < (matrix[j].length - 1) - i) {       // -vushe
                    System.out.println(matrix[i][j]);
                    sum1 += matrix[i][j];
                }
            }
        }
        System.out.println("\n" + sum1);

        System.out.println("---------");
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > (matrix[j].length - 1) - i) {       // -nizhe
                    System.out.println(matrix[i][j]);
                    sum2 += matrix[i][j];
                }
            }
        }
        System.out.println("\n" + sum2);
    }
}