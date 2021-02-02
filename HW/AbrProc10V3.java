package Solutions;

import java.io.PrintWriter;
import java.util.Scanner;

/*
Описать процедуру Swap(X, Y), меняющую содержимое переменных X и Y
(X и Y — вещественные параметры, являющиеся одновременно входными и выходными).
С ее помощью для данных переменных A, B, C, D последовательно поменять содержимое следующих пар:
A и B, C и D, B и C и вывести новые значения A, B, C, D.
 */

public class AbrProc10V3 {
    static Scanner sc = new Scanner(System.in);

    public int value;

    public AbrProc10V3(int val) {
        value = val;
    }

    public static void Swap(AbrProc10V3 x, AbrProc10V3 y) {
        int t = x.value;
        x.value = y.value;
        y.value = t;
    }

    public static void main(String[] args) {
        AbrProc10V3 a = new AbrProc10V3(sc.nextInt());
        AbrProc10V3 b = new AbrProc10V3(sc.nextInt());
        AbrProc10V3 c = new AbrProc10V3(sc.nextInt());
        AbrProc10V3 d = new AbrProc10V3(sc.nextInt());

        AbrProc10V3.Swap(a, b);
        AbrProc10V3.Swap(c, d);
        AbrProc10V3.Swap(b, c);

        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        System.out.println("D: " + d);
    }
}