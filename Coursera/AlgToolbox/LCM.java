package Coursera.AlgUCSanDiego.AlgToolbox;

import java.io.PrintWriter;
import java.util.Scanner;

public class LCM {
    static long NOD(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    void solve(Scanner sc, PrintWriter out) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        long abc = (long)a * (long)b;
        long tripleG = NOD(a, b);
        out.println(abc/tripleG);
    }

    void run() {
        try (Scanner sc = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new LCM().run();
    }
}