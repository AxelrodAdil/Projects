package Practice.Week_1;

import java.util.Scanner;
/*
Дан массив A размера N.
Вывести вначале его элементы с четными номерами
(в порядке возрастания номеров), а затем − элементы с нечетными номерами
(также в порядке возрастания номеров): A2, A4, A6, …, A1, A3, A5, … .
Условный оператор не использовать.
*/
public class AbrArr14 {
/*
input:7
12
24
12
24
12
24
12
output:24 24 24 --------------- 12 12 12 12
*/
    void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] A = new int[n+1];
        for (int i = 1; i <= n; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 2; i <= n; i+=2) {              //Четные
            System.out.printf("%2d ", A[i]);
        }

        System.out.println("---------------");

        for (int i = 1; i <= n; i+=2) {             //Нечетные
            System.out.printf("%2d ", A[i]);
        }
    }

    void run() {
        try (Scanner sc = new Scanner(System.in)) {
            solve(sc);
        }
    }

    public static void main(String[] args) {
        new AbrArr14().run();
    }
}