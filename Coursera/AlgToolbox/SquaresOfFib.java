package Coursera.AlgUCSanDiego.AlgToolbox;

import java.io.*;

public class SquaresOfFib {
    //static FastScanner sc = new FastScanner(System.in);

    private static long thisIsPisanoPeriod(long pressF) {
        long a = 0;
        long b = 1;
        long temp;
        for (int i = 0; i < pressF * pressF; i++) {
            temp = (a + b) % pressF;
            a = b;
            b = temp;
            if (a == 0 && b == 1) return i + 1;
        }
        return 0;
    }

    private static long FibNum(long n, long pressF) {
        long remainder = n % thisIsPisanoPeriod(pressF);
        long temp = remainder;
        long first = 0;
        long second = 1;
        for (int i = 1; i < remainder; i++) {
            temp = (first + second) % pressF;
            first = second;
            second = temp;
        }
        return temp % pressF;
    }

    private static long lastNumOfSquareSumFib(long n) {
        int mod = 60;
        int summaOfLastNums = 0;
        for (int i = 0; i <= n % mod; i++) {
            summaOfLastNums += Math.pow(FibNum(i, 10), 2) % 10;
        }
        return summaOfLastNums % 10;
    }

    void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] mass = reader.readLine().split(" ");
        long n = Long.parseLong(mass[0]);
        reader.close();
        System.out.println(lastNumOfSquareSumFib(n));
    }

    public static void main(String[] args) throws IOException {
        new SquaresOfFib().solve();
    }

    /*
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

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
    */
}