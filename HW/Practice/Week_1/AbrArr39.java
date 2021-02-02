package Practice.Week_1;

import java.io.PrintWriter;
import java.util.Scanner;
/*
Дан массив размера N. Найти количество его промежутков монотонности
(то есть участков, на которых его элементы возрастают или убывают).
*/
public class AbrArr39 {
/*
input: 3
5
2
6
output: 2
*/

    void solve (Scanner sc, PrintWriter out) {
        int n = sc.nextInt();

        if (n == 2){
            System.out.println(1);
            return;
        } else if (n < 2) {
            System.out.println("ERROR");
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (arr[i - 2] > arr[i - 1] && !(arr[i - 1] > arr[i])) {
                count++;
            }
            if ((arr[i - 2] < arr[i - 1]) && !(arr[i - 1] < arr[i])) {
                count++;
            }
        }

        if (arr [n-2] != arr[n-1]){
            count++;
        }
        out.println(count);
    }

    void run() {
        try (Scanner sc = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new AbrArr39().run();
    }
}