import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @Author Adil
 * @create 06.07.2021 0:50
 */
public class A344 {
    /**
     * Testing printwriter, tokens, area-of-visibility
     */
    static void solve() {
        try {
            //IntStream.range(1, 101).forEach(value -> System.out.println(value));

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            PrintWriter out = new PrintWriter(System.out);

            //String[] temp_array=br.readLine().split(" ");
            StringBuilder sb=new StringBuilder();

            int n = Integer.parseInt(st.nextToken());
            //int n = 1;
            while (n-->0) {
                //st = new StringTokenizer(br.readLine());
                //int N = Integer.parseInt(st.nextToken());
                //System.out.println(st.hasMoreTokens());
                //String[] arr = readArrString(6, br, st);

                st=new StringTokenizer(br.readLine());
                sb.append(st.nextToken());
            }
            int count=1;
            String ans=sb.toString();
            for (int i=0;i<ans.length()-1;i++){
                if(ans.charAt(i)==ans.charAt(i+1)) count++;
            }
            out.println(count);
            out.flush();
            out.close();
            //System.out.println(sb.toString());
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        timer(Solve::solve);
    }

    public static int[] readArr(int N, BufferedReader br, StringTokenizer st) throws Exception {
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) arr[i] = Integer.parseInt(st.nextToken());
        return arr;
    }

    public static String[] readArrString(int N, BufferedReader br, StringTokenizer st) throws Exception {
        String[] arr = new String[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) arr[i] = st.nextToken();
        return arr;
    }

    private static void timer(Runnable method) {
        long time = System.nanoTime();
        method.run();
        time = System.nanoTime() - time;
        double ans = (double) time / 1_000_000_000;
        //System.out.println("-------------\n"+ans);
    }
}
