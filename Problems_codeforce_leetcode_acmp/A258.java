import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @Author Adil
 * @create 05.07.2021 23:22
 */
public class A258 {
    /**
     * У Маленького Слоника есть целое число a, записанное в двоичной системе счисления. Он хочет написать это число на листке бумаги.
     *
     * Чтобы число a поместилось на листке бумаги, Маленький Слоник обязан удалить ровно одну любую цифру числа a в двоичной записи,
     * при этом образуется новое число из остальных двоичных цифр, записанных в соответствующем порядке (возможно, с лидирующими нулями).
     *
     * Маленький Слоник хочет, чтобы записанное на бумагу число было как можно больше. Помогите ему найти максимальное число,
     * которое может получиться в результате удаления ровно одной двоичной цифры, и выведите его в двоичной системе счисления.
     */

    static void solve() {
        try {
            //IntStream.range(1, 101).forEach(value -> System.out.println(value));
            //StringBuilder sb = new StringBuilder();

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            //int n = Integer.parseInt(st.nextToken());
            int n = 1;
            while (n-->0) {
                /*st = new StringTokenizer(br.readLine());
                int N = Integer.parseInt(st.nextToken());
                int[] arr = readArr(N, br, st);

                int sum = 0;
                for(int x: arr){
                    sum += x%2;
                }*/

                String str=st.nextToken();
                StringBuilder sb=new StringBuilder();
                int i=0;
                for(char c:str.toCharArray()){
                    if(c=='0' && i<1){
                        i++;
                    } else {
                        sb.append(c);
                    }
                }
                if(i==0) sb.delete(0,1);
                System.out.println(sb.toString());
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        timer(A258::solve);
    }

    public static int[] readArr(int N, BufferedReader br, StringTokenizer st) throws Exception {
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) arr[i] = Integer.parseInt(st.nextToken());
        return arr;
    }

    private static void timer(Runnable method) {
        long time = System.nanoTime();
        method.run();
        time = System.nanoTime() - time;
        double ans = (double) time / 1_000_000_000;
        //System.out.println(ans);
    }
}
