package Coursera.AlgUCSanDiego.AlgToolbox;

import java.io.*;
import java.util.*;

public class lcs3 {
    static FastScanner sc = new FastScanner(System.in);

    private static int Lcs3(int[] arrA, int[] arrB, int [] arrC) {
        int n = arrA.length;
        int m = arrB.length;
        int c = arrC.length;
        int[][][] matrix = new int[n + 1][m + 1][c + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                for (int k = 0; k < arrC.length + 1; k++) {
                    if (i == 0 || j == 0 || k == 0) {
                        matrix[i][j][k] = 0;
                    } else if (arrA[i - 1] == arrB[j - 1] && arrA[i - 1] == arrC[k - 1]) {
                        matrix[i][j][k] = 1 + matrix[i - 1][j - 1][k - 1];
                    } else {
                        matrix[i][j][k] = Math.max(matrix[i - 1][j][k],
                                Math.max(matrix[i][j - 1][k], matrix[i][j][k - 1]));
                    }
                }
            }
        }
        return matrix[n][m][c];
    }

    void solve() {
        int n = sc.nextInt();
        int[] arrA = new int[n];
        for (int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arrB = new int[m];
        for (int i = 0; i < m; i++) {
            arrB[i] = sc.nextInt();
        }

        int c = sc.nextInt();
        int[] arrC = new int[c];
        for (int i = 0; i < c; i++) {
            arrC[i] = sc.nextInt();
        }

        System.out.println(Lcs3(arrA, arrB, arrC));
    }

    public static void main(String[] args) {
        new lcs3().solve();
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