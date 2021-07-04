package Practice.Week_2;

import java.util.Scanner;
/*
Описать процедуру ArrayToMatrCol(A, K, M, N, B),
формирующую по вещественному массиву A размера K матрицу B размера M × N
(матрица заполняется элементами массива A по столбцам).
«Лишние» элементы массива игнорируются;
если элементов массива недостаточно,
то оставшиеся элементы матрицы полагаются равными 0.
Двумерный массив B является выходным параметром.
С помощью этой процедуры на основе данного массива A размера K
и целых чисел M и N сформировать матрицу B размера M × N.
*/
public class Param17 {
/*
input1: 5
1 2 3 4 5
2 2
output1:
1 2
3 4
......................
input2: 5
1 2 3 4 5
3 3
output2:
1 2 3
4 5 0
0 0 0
*/
    void ArrayToMatrCol (int[] arrA, int k, int m, int n, int[][] arrB){
        int temp = 0;

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (temp < k) {
                    arrB[i][j] = arrA[temp];
                    temp++;
                } else {
                    arrB[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arrB[i][j] + " ");
            }
            System.out.println();
        }
    }

    void solve (Scanner sc){
        int k = sc.nextInt();
        int[] arrA = new int[k];
        for (int i = 0; i < k; i++){
            arrA[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arrB = new int[m][n];

        ArrayToMatrCol(arrA, k, m, n, arrB);
    }

    void run() {
        try (Scanner sc = new Scanner(System.in)) {
            solve(sc);
        }
    }

    public static void main(String[] args) {
        new Param17().run();
    }
}