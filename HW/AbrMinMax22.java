package HW;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class AbrMinMax22 {
    /*
    Дано целое число N (> 2) и набор из N чисел.
    Найти два наименьших элемента из данного набора
    и вывести эти элементы в порядке возрастания их значений.
     */

    void solve(Scanner sc, PrintWriter out) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //sort істеуге шектеу болмағандықтан:
        Arrays.sort(arr);
        out.println(arr[0]);
        out.println(arr[1]);
    }

    void run() {
        try (Scanner sc = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new AbrMinMax22().run();
    }
}