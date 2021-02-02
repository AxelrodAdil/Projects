package Solutions;

import java.util.Scanner;

public class AbrMatrix5 {
    /*
    Даны целые положительные числа M, N, число D и набор из M чисел.
    Сформировать матрицу размера M × N, у которой первый столбец совпадает
    с исходным набором чисел, а элементы каждого следующего столбца равны
    сумме соответствующего элемента предыдущего столбца и числа D
    (в результате каждая строка матрицы будет содержать элементы арифметической прогрессии).
     */
    void solve(Scanner sc) {
        int m = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] arr = new int[m][n];

        System.out.println("------------");

        for (int i = 0; i<m; i++){
            int k = sc.nextInt();
            arr[i][0] = k;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j] = arr[i][j-1]+d;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    void run() {
        try (Scanner sc = new Scanner(System.in)) {
            solve(sc);
        }
    }

    public static void main(String[] args) {
        new AbrMatrix5().run();
    }
}