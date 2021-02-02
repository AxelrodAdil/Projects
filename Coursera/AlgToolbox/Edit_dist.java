package Coursera.AlgUCSanDiego.AlgToolbox;

import java.io.*;
import java.util.*;

public class Edit_dist {

    static int editDistance (String s, String t){
        if ("".equals(s)) return t.length();
        if ("".equals(t)) return s.length();

        int t_length = t.length();
        int s_length = s.length();
        int[][] matrix = new int[s_length + 1][t_length + 1];

        for (int i = 0; i < s_length + 1; i++) {
            for (int j = 0; j < t_length + 1; j++) {
                if (i == 0 || j == 0) {
                    matrix[i][j] = i + j;
                } else {
                    int addTo = matrix[i - 1][j] + 1;
                    int delTo = matrix[i][j - 1] + 1;
                    int to1 = matrix[i - 1][j - 1];
                    int misto1 = matrix[i - 1][j - 1] + 1;
                    if (s.charAt(i - 1) == t.charAt(j - 1)) {
                        matrix[i][j] = Math.min(addTo, Math.min(delTo, to1));
                    } else {
                        matrix[i][j] = Math.min(addTo, Math.min(delTo, misto1));
                    }
                }
            }
        }
        return matrix[s_length][t_length];
    }

    void solve() {
        FastScanner sc = new FastScanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(editDistance(s, t));
    }

    public static void main(String[] args) {
        new Edit_dist().solve();
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