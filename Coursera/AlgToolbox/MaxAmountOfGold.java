package Coursera.AlgUCSanDiego.AlgToolbox;
//DONE
import java.io.*;
import java.util.*;

public class MaxAmountOfGold {
    static FastScanner sc = new FastScanner(System.in);

    static int optimalWeight (int W, int [] w){
        int[][] matrix = new int[w.length + 1][W + 1];
        for (int i = 0; i < w.length + 1; i++) {
            for (int j = 0; j < W + 1; j++) {
                if (j == 0 || i == 0) {
                    matrix[i][j] = 0;
                } else {
                    if (w[i - 1] > j) {
                        matrix[i][j] = matrix[i - 1][j];
                    } else {
                        matrix[i][j] = Math.max(matrix[i - 1][j], matrix[i - 1][j - w[i - 1]] + w[i - 1]);
                    }
                }
            }
        }
        return matrix [w.length][W];
    }

    void solve() {
        int W, n;
        W = sc.nextInt();
        n = sc.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }
        System.out.println(optimalWeight(W, w));
    }

    public static void main(String[] args) {
        new MaxAmountOfGold().solve();
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