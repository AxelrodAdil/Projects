package Practice.Week_1;

import java.io.PrintWriter;
import java.util.Scanner;
/*
Дана матрица размера M × N.
В каждой ее строке найти количество элементов,
меньших среднего арифметического всех элементов этой строки.
*/
public class AbrMatrix29 {
/*
input: 3 3
1 2 3
4 5 6
7 8 9
output:
Количество элементов меньших чем сред. ариф. в строке 1: 1
Количество элементов меньших чем сред. ариф. в строке 2: 1
Количество элементов меньших чем сред. ариф. в строке 3: 1

input_V2: 3 3
25 48 34
12 48 65
17 45 30
output:
Количество элементов меньших чем сред. ариф. в строке 1: 2
Количество элементов меньших чем сред. ариф. в строке 2: 1
Количество элементов меньших чем сред. ариф. в строке 3: 1
*/
    void solve (Scanner sc, PrintWriter out){
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int summa = 0;
        int[] mean = new int[n];
        for (int i = 0; i < n; i++){
            summa = 0;
            for (int j = 0; j < m; j++){
                summa += arr[i][j];
            }
            mean[i] = summa / m;
        }

        int count = 0;
        for (int i = 0; i < n; i++){
            count = 0;
            for (int j = 0; j < m; j++){
                if (arr[i][j] < mean[i]){
                    count++;
                }
            }
            System.out.println("Количество элементов меньших чем сред. " +
                    "ариф. в строке " + (i+1) + ": " + count);
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
        new AbrMatrix29().run();
    }
}