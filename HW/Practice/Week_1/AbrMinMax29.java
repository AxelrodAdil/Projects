package Practice.Week_1;

import java.io.PrintWriter;
import java.util.Scanner;

public class AbrMinMax29 {
/*
Дано целое число N и набор из N целых чисел.
Найти максимальное количество подряд идущих
минимальных элементов из данного набора.
*/
    void solve(Scanner sc, PrintWriter out) {
        int count = 0;
        int minNum = 0;
        int maxNum = 0;

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (i == 0 || arr[i] < minNum){
                minNum = arr[i];
                count = 0;
            }

            if (arr[i] == minNum) {
                count++;
            } else {
                if (count > maxNum) maxNum = count;
                count = 0;
            }
        }

        if (count > maxNum) maxNum = count;
        out.println(maxNum);
    }

    void run() {
        try (Scanner sc = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new AbrMinMax29().run();
    }
}