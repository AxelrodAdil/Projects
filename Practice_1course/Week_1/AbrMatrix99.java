package Practice.Week_1;

import java.io.PrintWriter;
import java.util.Scanner;
/*
Дана квадратная матрица A порядка M.
Повернуть ее на угол 90º в положительном направлении,
то есть против часовой стрелки
(при этом элемент A1,1 перейдет в AM,1, элемент AM,1 — в AM,M и т. д.).
Вспомогательную матрицу не использовать.
*/
public class AbrMatrix99 {
/*
input: 3
1 2 3
4 5 6
7 8 9
output:
3 6 9
2 5 8
1 4 7 
*/
    void solve (Scanner sc, PrintWriter out) {
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j][n-i-1] + " ");
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
        new AbrMatrix99().run();
    }
}