package Solutions;

import java.io.PrintWriter;
import java.util.Scanner;
import static java.lang.System.out;

/*
Описать функцию Calc(A, B, Op) вещественного типа,
выполняющую над ненулевыми вещественными числами A и B одну из арифметических операций
и возвращающую ее результат.
Вид операции определяется целым параметром Op: 1 — вычитание, 2 — умножение, 3 — деление,
остальные значения — сложение. С помощью Calc выполнить для данных A и B операции,
определяемые данными целыми N1, N2, N3.
 */

public class AbrProc22 {
    static Scanner sc = new Scanner(System.in);

    static int calc(int a, int b, int n){
        switch (n){
            case 1:
                return a-b;
            case 2:
                return a*b;
            case 3:
                return a/b;
            default:
                return a+b;
        }
    }

    void solve (Scanner sc, PrintWriter out){
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0; i < 3; i++){
            int n = sc.nextInt();
            out.println(calc(a,b,n));
        }
    }

    void run() {
        try (Scanner sc = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new AbrProc22().run();
    }
}