package Solutions;

import java.io.PrintWriter;
import java.util.Scanner;

/*
Описать процедуру Swap(X, Y), меняющую содержимое переменных X и Y
(X и Y — вещественные параметры, являющиеся одновременно входными и выходными).
С ее помощью для данных переменных A, B, C, D последовательно поменять содержимое следующих пар:
A и B, C и D, B и C и вывести новые значения A, B, C, D.
 */

class ValuesInt {
    Scanner sc = new Scanner(System.in);
    public int a = sc.nextInt();
    public int b = sc.nextInt();
    public int c = sc.nextInt();
    public int d = sc.nextInt();
}

public class AbrProc10V2 {

    void Swap(int x, int y) {
        ValuesInt rc = new ValuesInt();
        int t = x;
        x = y;
        y = t;

    }

    void solve(Scanner sc, PrintWriter out) {
        ValuesInt rc = new ValuesInt();

        Swap(rc.a, rc.b);
        Swap(rc.c, rc.d);
        Swap(rc.b, rc.c);

        out.println("A: " + rc.a);
        out.println("B: " + rc.b);
        out.println("C: " + rc.c);
        out.println("D: " + rc.d);
    }

    void run() {
        try (Scanner sc = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new AbrProc10V2().run();
    }
}