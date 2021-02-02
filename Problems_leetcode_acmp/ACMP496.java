package Solutions;

import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP496 {


    void solve(Scanner sc, PrintWriter out) {
        int n = sc.nextInt();
        int summa = 0;
        int[] arr = new int[n + 2];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        arr[n] = arr[0];
        arr[n + 1] = arr[1];

        for (int i = 1; i < n+1; i++) {
            int t = arr[i - 1] + arr[i] + arr[i + 1];
            if (t > summa) {
                summa = t;
            }
        }
        out.println(summa);
    }

    void run() {
        try (Scanner sc = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new ACMP496().run();
    }
}