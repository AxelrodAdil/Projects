import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @Author Adil
 * @create 21.07.2021 22:52
 */

public class A160 {
    static Solve.FastReader sc=new Solve.FastReader();
    static void solve() {
        //IntStream.range(1, 101).forEach(value -> System.out.println(value));

        PrintWriter out = new PrintWriter(System.out);

        //int n=sc.nextInt();
        int n_=1;
        int ans=0;

        while (n_-->0) {
            int n=sc.nextInt();
            int[] arr=new int[n];

            int sum1=0, sum2=0, step=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                sum1+=arr[i];
            }

            Arrays.sort(arr);

            for(int i=n-1;i>=0;i--){
                sum2+=arr[i];
                step++;
                if(sum1-sum2<sum2){
                    System.out.println(step);
                    return;
                }
            }

            out.println(n);

            /*if() out.println("YES");
            else out.println("NO");*/
        }

        //out.println(ans);
        out.flush();
        out.close();
        //System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        timer(A160::solve);
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
