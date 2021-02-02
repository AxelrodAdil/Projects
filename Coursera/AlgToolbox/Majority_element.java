package Coursera.AlgUCSanDiego.AlgToolbox;
//DONE
import java.io.*;
import java.util.*;

public class Majority_element {

    static int MajorityElement(int[] a, int left, int right) {
        int countRight = 0;
        int countLeft = 0;

        if (left == right) {
            return -1;
        }
        if (left + 1 == right) {
            return a[left];
        }

        //............
        int leftE = MajorityElement(a, left, (left + right - 1) / 2 + 1);
        int rightE = MajorityElement(a, (left + right - 1) / 2 + 1, right);
        //............

        for (int i = left; i < right; i++) {
            if (a[i] == leftE) countLeft += 1;
        }
        if (countLeft > (right - left) / 2) return leftE;

        for (int i = left; i < right; i++) {
            if (a[i] == rightE) countRight += 1;
        }
        if (countRight > (right - left) / 2) return rightE;

        return -1;
    }

    void solve(PrintWriter out) {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        if (MajorityElement(a, 0, a.length) != -1) {
            out.println(1);
        } else {
            out.println(0);
        }
    }

    void run() {
        try (PrintWriter out = new PrintWriter(System.out)) {
            solve(out);
        }
    }

    public static void main(String[] args) {
        new Majority_element().run();
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

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}