package Coursera.AlgUCSanDiego.AlgToolbox;

import java.io.*;
import java.util.*;

public class change_dp {
    static FastScanner sc = new FastScanner(System.in);

    private static int getChange(int n) {
        int[] arr = new int[n + 1];
        int i = 1;

        while (i <= n) {
            int A1 = Integer.MAX_VALUE;
            if (i - 1 >= 0) {
                A1 = arr[i - 1] + 1;
            }

            int B1 = Integer.MAX_VALUE;
            if (i - 3 >= 0) {
                B1 = arr[i - 3] + 1;
            }

            int C1 = Integer.MAX_VALUE;
            if (i - 4 >= 0) {
                C1 = arr[i - 4] + 1;
            }
            int min = Math.min(A1, Math.min(B1, C1));

            if(arr[i] == 0 || min < arr[i]) {
                arr[i] = min;
            }
            i++;
        }
        return arr[n];
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println(getChange(n));
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