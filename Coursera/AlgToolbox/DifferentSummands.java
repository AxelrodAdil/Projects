package Coursera.AlgUCSanDiego.AlgToolbox;

import java.io.*;
import java.util.*;

public class DifferentSummands {
    static FastScanner sc = new FastScanner(System.in);

    private static List<Integer> optimalSummands(int n) {
        List<Integer> summands = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            n -= i;
            if (n <= i) {
                summands.add(n + i);
            } else if (n == 0) {
                summands.add(i);
                break;
            } else {
                summands.add(i);
            }
        }
        return summands;
    }

    void solve () throws IOException {
        int n = sc.nextInt();
        List<Integer> list = optimalSummands(n);
        System.out.println(list.size());
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        new DifferentSummands().solve();
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