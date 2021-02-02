package PLaT;

import java.util.Scanner;

public class W7_matrix_5 {

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

        System.out.println("---------");                    // 10-13
        int sum1 = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i < j && j < (matrix[j].length - 1) - i){       // vushe-vushe
                    System.out.println(matrix[i][j]);
                    sum1 += matrix[i][j];
                }
            }
        }
        System.out.println("\n"+sum1);

        System.out.println("---------");
        int sum2 = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i < j && j > (matrix[j].length - 1) - i){       // vushe-nizhe
                    System.out.println(matrix[i][j]);
                    sum2 += matrix[i][j];
                }
            }
        }
        System.out.println("\n"+sum2);

        System.out.println("---------");
        int sum3 = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i > j && j < (matrix[j].length - 1) - i){       // nizhe-vushe
                    System.out.println(matrix[i][j]);
                    sum3 += matrix[i][j];
                }
            }
        }
        System.out.println("\n"+sum3);
    }
}