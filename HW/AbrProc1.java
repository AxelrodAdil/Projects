package Solutions;

import java.io.PrintWriter;
import java.util.Scanner;

/*
Описать процедуру PowerA3(A, B),
вычисляющую третью степень числа A и возвращающую ее в переменной B (A — входной, B — выходной параметр;
оба параметра являются вещественными).
С помощью этой процедуры найти третьи степени пяти данных чисел.
 */

public class AbrProc1 {
    public static float PowerA3(float a, float b) {
        b = a * a * a;
        return b;
    }

    void solve(Scanner sc, PrintWriter out) {
        float b = 0;
        for (int i = 0; i < 5; i++) {
            float a = sc.nextFloat();
            out.println(PowerA3(a, b));
            //System.err.println (PowerA3(a, b));
        }
    }

    private void run() {
        try (Scanner sc = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new AbrProc1().run();
    }
}