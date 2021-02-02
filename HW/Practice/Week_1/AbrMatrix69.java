package Practice.Week_1;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
/*
Дана матрица размера M * N и целое число K (1 ≤ K ≤ N).
После столбца матрицы с номером K вставить столбец из единиц.
*/

public class AbrMatrix69 {
/*
input: 3 3 1
1 2 3
4 5 6
7 8 9
output:
1 1 2 3
4 1 5 6
7 1 8 9
*/

    void solve (Scanner sc, PrintWriter out) {
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[m * 5][n * 5];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("-------");
        n++;
        int i, j;
        for (j = n - 1; j > k; --j) {
            for (i = 0; i < n; ++i) {
                arr[i][j] = arr[i][j - 1];
            }
        }
        for (i = 0; i < m; ++i) {
            arr[i][k] = 1;
        }

        for (i = 0; i < m; ++i) {
            for (j = 0; j < n; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        //Матрица динамикалык емес...
        out.println();
    }

    void run() {
        try (Scanner sc = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new AbrMatrix69().run();
    }
}