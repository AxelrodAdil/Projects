package PLaT;

import java.util.Scanner;

public class W7_matrix_1 {
    // W7_matrix_

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                // matrix[i][j] = sc.nextInt();
                matrix[i][j] = (int)(Math.random()*100);
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("---------");
        int min1 = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i > j && matrix[i][j] < min1){     // main nizhe
                    System.out.println(matrix[i][j]);
                    min1 = matrix[i][j];
                }
            }
        }
        System.out.println("\n"+min1);

        System.out.println("----------------------------------");
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i < j && matrix[i][j] < min2){     // main vverh
                    System.out.println(matrix[i][j]);
                    min2 = matrix[i][j];
                }
            }
        }

        System.out.println("\n"+min2);
    }
}