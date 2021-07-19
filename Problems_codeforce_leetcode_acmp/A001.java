import java.io.*;
import java.util.*;

/**
 * @Author Adil
 * @create 19.07.2021 21:51
 */

public class A001 {
    static FastReader sc=new FastReader();
    static void solve() {
        //IntStream.range(1, 101).forEach(value -> System.out.println(value));

        PrintWriter out = new PrintWriter(System.out);

        //int n=sc.nextInt();
        int n_=1;

        int ans=0;
        while (n_-->0) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            long a_ = a/c+(int)Math.signum(a%c);
            long b_ = b/c+(int)Math.signum(b%c);
            System.out.print(a_*b_);
        }
        //out.println(ans);
        out.flush();
        out.close();
        //System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        timer(A001::solve);
    }

    private static void timer(Runnable method) {
        long time = System.nanoTime();
        method.run();
        time = System.nanoTime() - time;
        double ans = (double) time / 1_000_000_000;
        //System.out.println("-------------\n"+ans);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
