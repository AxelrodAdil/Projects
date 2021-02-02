package Coursera.AlgUCSanDiego.AlgToolbox;
//DONE
import java.io.*;
import java.util.*;

public class LastDigitOfTheSumOfFibNums {
    static FastScanner sc = new FastScanner(System.in);

    public static int getFibLastDigit(int n) {
        if (n <= 1) return n;
        int[] result = new int[n + 1];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            result[i] = (result[i - 1] + result[i - 2]) % 10;
        }
        return result[n];
    }

    public static int getFibonacciSum(long n) {
        int new_n = (int) ((n + 2) % 60);
        int new_last = getFibLastDigit(new_n);
        if (new_last == 0) {
            return 9;
        } else {
            return new_last - 1;
        }
    }

    void solve (){
        long n = sc.nextLong();
        long s = getFibonacciSum(n);
        System.out.println(s);
    }

    public static void main(String[] args) {
        new LastDigitOfTheSumOfFibNums().solve();
    }

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

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}