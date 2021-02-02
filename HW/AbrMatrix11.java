package Solutions;

import java.util.Scanner;

/*
Дана матрица размера M * N.
Вывести ее элементы в следущем порядке: первая строка слева направо,
вторая строка справа налево, третья строка слева направо, четвертая строка справа налево и т.д.
 */

public class AbrMatrix11 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = sc.nextInt();
                arr[i][j] = k;
                //arr[i][j] = n*i+j+1;
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i%2==0){
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print(arr[i][n-j-1] + " ");
                }
            }
            System.out.println();
        }

        System.out.println();
    }
}