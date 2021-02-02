package Coursera.AlgUCSanDiego.AlgToolbox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class parantheses {
    static private long[][] arrA;
    static private long[][] arrB;

    private static long eval(long a, long b, char op) {
        if (op == '+') {
            return a + b;
        } else if (op == '-') {
            return a - b;
        } else if (op == '*') {
            return a * b;
        } else {
            assert false;
            return 0;
        }
    }

    private static long[] minMax(int i, int j, char[] C) {
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for (int k = i; k < j; k++) {
            long a = eval(arrB[i][k], arrB[k + 1][j], C[k]);
            long b = eval(arrB[i][k], arrA[k + 1][j], C[k]);
            long c = eval(arrA[i][k], arrB[k + 1][j], C[k]);
            long d = eval(arrA[i][k], arrA[k + 1][j], C[k]);
            min = Math.min(Math.min(a, b), Math.min(c, Math.min(d, min)));
            max = Math.max(Math.max(a, b), Math.max(c, Math.max(d, max)));
        }
        return new long[]{min, max};
    }

    private static long MaxValues(String stringSTR) {
        if (stringSTR.length() == 1) {
            return Long.parseLong(stringSTR);
        }

        int[] numbers = IntStream.range(0, stringSTR.length()).filter(i -> i % 2 == 0).map(stringSTR::charAt).map(Character::getNumericValue).toArray();
        char[] ops = new char[(stringSTR.length() - 1) / 2];
        int j = 0;
        for (int i = 1; i < stringSTR.length(); i += 2) {
            ops[j] = stringSTR.charAt(i);
            j++;
        }
        arrA = new long[numbers.length][numbers.length];
        arrB = new long[numbers.length][numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            arrA[i][i] = numbers[i];
            arrB[i][i] = numbers[i];
        }
        for (int i = 1; i < numbers.length; i++) {
            j = i;
            int k = 0;
            while (j != numbers.length) {
                long[] minMax = minMax(k, j, ops);
                arrA[k][j] = minMax[0];
                arrB[k][j] = minMax[1];
                j++;
                k++;
            }
        }
        return arrB[0][numbers.length - 1];
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        String stringSTR = sc.next();
        System.out.println(MaxValues(stringSTR));
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

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}