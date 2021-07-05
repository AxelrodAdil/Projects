import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @Author Adil
 * @create 05.07.2021 23:28
 */
public class A459 {
    /**
     * Пашмак уже целый год влюблен в красивую девушку по имени Пармида... Сегодня Пашмак решил устроить свидание с ней в романтическом саду.
     * К сожалению, парень забыл, где находится этот сад. Пашмак точно помнит, что сад имеет форму квадрата со сторонами, параллельными осям координат.
     * Также он помнит, что в каждой вершине квадрата растет ровно одно дерево. Пашмак знает положение двух из этих деревьев. Помогите ему найти,
     * где расположены другие два дерева.
     *
     * Входные данные
     * В первой строке записано четыре целых числа через пробел x1,y1,x2,y2 (-100≤x1,y1,x2,y2≤100).
     * Точка с координатами (x1,y1) обозначает расположение первого дерева, точка с координатами (x2,y2) обозначает расположение второго дерева.
     * Гарантируется, что заданные точки различны.
     *
     * Выходные данные
     * Если решения не существует, выведите -1. В противном случае выведите четыре целых числа через пробел x3,y3,x4,y4 — координаты двух других деревьев.
     * Если существует несколько правильных решений, разрешается вывести любое из них.
     *
     * Обратите внимание, что x3,y3,x4,y4 должны удовлетворять условиям (-1000≤x3,y3,x4,y4≤1000).
     */

    static void solve() {
        try {
            //IntStream.range(1, 101).forEach(value -> System.out.println(value));

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //StringTokenizer st = new StringTokenizer(br.readLine());
            String[] temp_array=br.readLine().split(" ");
            StringBuilder sb=new StringBuilder();

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

                //String str=st.nextToken();
                int x1=Integer.parseInt(temp_array[0]);
                int y1=Integer.parseInt(temp_array[1]);
                int x2=Integer.parseInt(temp_array[2]);
                int y2=Integer.parseInt(temp_array[3]);

                if(x1==x2){
                    int distance=Math.abs(y1-y2);
                    sb.append((x1+distance)+" ").append(y1+" ").append((x2+distance)+" ").append(y2);
                } else if(y1==y2){
                    int distance=Math.abs(x1-x2);
                    sb.append(x1+" ").append((y1+distance)+" ").append(x2+" ").append(y2+distance);
                } else if(Math.abs(x1-x2)==Math.abs(y1-y2)){
                    sb.append(x1+" ").append(y2+" ").append(x2+" ").append(y1);
                } else{
                    sb.append(-1);
                }
                System.out.println(sb.toString());
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        timer(A459::solve);
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
