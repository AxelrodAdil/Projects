package Coursera.AlgUCSanDiego.AlgToolbox;
//DONE
import java.io.*;
import java.util.*;

public class Fibonacci_number_again {
    /*
    private static long getFibonacciHugeNaive(long n, long m) {
        if (n <= 1)
            return n;
        long previous = 0;
        long current = 1;
        for (long i = 0; i < n - 1; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
        }
        return current % m;
    }
    */

    static long IdidpisanoPeriod (long m, long fib1, long fib2) {
        long temp = 0;
        long fibRecur;

        for (int i = 0; i < m * m; i++) {
            fibRecur = (fib1 + fib2) % m;
            fib1 = fib2;
            fib2 = fibRecur;
            if (fib1 == 0 && fib2 == 1) {
                temp = i + 1;
                break;
            }
        }
        return temp;
    }

    static long getFibonacciHugeFaster(long n, long m) {
        long fib1 = 0;
        long fib2 = 1;
        long nModPisanoP = n % IdidpisanoPeriod(m, fib1, fib2);
        long fibRecur = nModPisanoP;

        for (int i = 1; i < nModPisanoP; i++) {
            fibRecur = (fib1 + fib2) % m;
            fib1 = fib2;
            fib2 = fibRecur;
        }
        return fibRecur % m;
    }

    void solve() {
        FastScanner sc = new FastScanner(System.in);
        long n = sc.nextlong();
        long m = sc.nextlong();
        System.out.println(getFibonacciHugeFaster(n, m));
    }

    public static void main(String[] args) {
        new Fibonacci_number_again().solve();
    }

    //......................

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        long nextlong() {
            return Long.parseLong(next());
        }
    }
}