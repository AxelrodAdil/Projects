package Practice.Week_1;

import java.io.PrintWriter;
import java.util.Scanner;
/*
Дана матрица размера M × N.
Вывести ее элементы в следующем порядке: первый столбец сверху вниз,
второй столбец снизу вверх, третий столбец сверху вниз,
четвертый столбец снизу вверх и т. д.
 */
public class AbrMatrix12 {
/*
4 4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
*/
    void solve (Scanner sc, PrintWriter out){
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m*2][n*2];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j%2==0){
                    System.out.print(arr[i][j]+" ");
                } else {
                    System.out.print(arr[n-i-1][j]+" ");
                }
            }
            System.out.println();
        }

        out.println();
    }

    void run() {
        try (Scanner sc = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new AbrMatrix12().run();
    }
}