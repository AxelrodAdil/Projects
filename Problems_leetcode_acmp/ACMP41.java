package Solutions;

import java.util.*;
import java.io.*;

public class ACMP41 {

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                        InputStreamReader(stream));
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

    void solve(PrintWriter out){
        FastScanner sc = new FastScanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            out.print(arr[i]+" ");
        }
    }

    void run(){
        try (PrintWriter out = new PrintWriter(System.out)){
            solve(out);
        }
    }

    public static void main(String[] args) {
        new ACMP41().run();
    }
}