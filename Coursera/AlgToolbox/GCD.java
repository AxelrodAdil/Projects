package Coursera.AlgUCSanDiego.AlgToolbox;
//DONE
import java.io.PrintWriter;
import java.util.Scanner;

public class GCD {

    static int NOD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    void solve(Scanner sc, PrintWriter out) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int bestNOD = NOD(a, b);
        out.println(bestNOD);
    }

    void run() {
        try (Scanner sc = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new GCD().run();
    }
}