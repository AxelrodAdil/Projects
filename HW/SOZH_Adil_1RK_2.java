import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class SOZH_Adil_1RK_2 {
    /**
     * 14.	Қандай да бір  қалада  автобустағы билеттер қағаз түрінде беріледі.
     * Автобустар депосы әр апта сайын жергілікті баспа үйінен 00000001-ден 99999999-ға дейінгі нөмірлермен
     * билеттерге тапсырыс береді. Егер нөмірдің алғашқы төрт цифрының қосындысы соңғы төрт цифрдың
     * қосындысына тең болса, мысалы, 00053002 немесе 38503058 нөмірлі билеттерде билет «бақытты» болып саналады .
     * Автобус депосы әр сәттілік билеттің иесіне сыйлық беруді шеште. Енді қанша сыйлық  керек болады деп ойланып жүр.
     * Бағдарламаны пайдаланып, бір рулонда қанша бақытты билет бар екенін санаңыз?
     */

    void solve2() {
        int howMuch = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(36);
        int[] arr = new int[10_000];
        for (int j = 0; j < 37; j++) {
            map.put(j, 0);
        }
        for (int i = 0; i < 10_000; i++) {
            int key = i % 10 + i / 10 % 10 + i / 100 % 10 + i / 1000;
            map.put(key, map.get(key) + 1);
            arr[i] = key;
        }
        for (int k = 0; k < 10_000; k++) {
            howMuch = howMuch + map.get(arr[k]);
        }
        System.out.println(howMuch);
    }

    void solve(PrintWriter out) {
        long count = 0;
        long a1, a2, a3, a4, a5, a6, a7, a8;
        //int sum1 = 0, sum2 = 0;
        for (long i = 0; i < 100_000_000; i++) {
            a1 = i / 10_000_000;
            a2 = i / 1_000_000 % 10;
            a3 = i / 100_000 % 10;
            a4 = i / 10_000 % 10;
            a5 = i / 1000 % 10;
            a6 = i / 100 % 10;
            a7 = i / 10 % 10;
            a8 = i % 10;
            if (a1 + a2 + a3 + a4 == a5 + a6 + a7 + a8) {
                count++;
            }
        }
        out.println(count);

        solve2();
    }

    void run() {
        try (PrintWriter out = new PrintWriter(System.out)) {
            solve(out);
        }
    }

    public static void main(String[] args) {
        new SOZH_Adil_1RK_2().run();
    }
}