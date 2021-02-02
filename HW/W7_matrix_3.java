package PLaT;

import java.util.Scanner;

public class W7_matrix_3 {

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
        int max1 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i > j && matrix[i][j] > max1){     // main nizhe
                    System.out.println(matrix[i][j]);
                    max1 = matrix[i][j];
                }
            }
        }
        System.out.println("\n"+max1);

        System.out.println("----------------------------------");
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i < j && matrix[i][j] > max2){     // main vverh
                    System.out.println(matrix[i][j]);
                    max2 = matrix[i][j];
                }
            }
        }

        System.out.println("\n"+max2);
    }
}