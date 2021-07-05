import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @Author Adil
 * @create 05.07.2021 23:05
 */
public class A757 {

    /**
     * Баш хочет когда-нибудь стать мастером Покемонов. Ему нравятся многие покемоны, но больше всего он впечатлен Бульбазавром.
     * Он еще слишком юн, чтобы поймать Бульбазавра по-настоящему, поэтому он придумал свой способ поймать его.
     *
     * Каждый день Баш берет первую страницу газеты и вырезает из нее буквы. Он составляет из них слова "Bulbasaur" (без кавычек)
     * и клеит себе на стену. Башу важен регистр букв: первая буква "Bulbasaur" должна быть заглавная, а остальные — строчные.
     * Составив очередное слово, он считает, что поймал одного Бульбазавра. Затем он продолжает вырезать буквы и составлять из них слово,
     * пока на странице еще достаточно букв для составления слова "Bulbasaur".
     *
     * Вам дан текст первой страницы газеты. Сколько Бульбазавров поймает Баш сегодня?
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
                String str = st.nextToken();

            /*st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] arr = readArr(N, br, st);

            int sum = 0;
            for(int x: arr)
                sum += x%2;*/

                int[] characters = new int[256];
                for (char c : str.toCharArray()) {
                    characters[c]++;
                }

                int ans = Integer.MAX_VALUE;
                ans = Math.min(ans, characters['B']);
                ans = Math.min(ans, characters['u'] / 2);
                ans = Math.min(ans, characters['l']);
                ans = Math.min(ans, characters['b']);
                ans = Math.min(ans, characters['a'] / 2);
                ans = Math.min(ans, characters['s']);
                ans = Math.min(ans, characters['r']);


                System.out.println(ans);
                //System.out.print(sb);
            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        timer(A757::solve);
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
