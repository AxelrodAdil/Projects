package Solutions;

import java.util.Scanner;
import static java.lang.System.out;

/*
Описать процедуру Swap(X, Y), меняющую содержимое переменных X и Y
(X и Y — вещественные параметры, являющиеся одновременно входными и выходными).
С ее помощью для данных переменных A, B, C, D последовательно поменять содержимое следующих пар:
A и B, C и D, B и C и вывести новые значения A, B, C, D.
 */

class Holder<T> {
    private T mValue;

    public Holder(T value) {
        setValue(value);
    }

    public T getValue() {
        return mValue;
    }

    public void setValue(T value) {
        mValue = value;
    }

    @Override
    public String toString() {
        return mValue.toString();
    }
}

public class AbrProc10 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws java.lang.Exception {
        Holder<Integer> a = new Holder<Integer>(sc.nextInt());
        Holder<Integer> b = new Holder<Integer>(sc.nextInt());
        Holder<Integer> c = new Holder<Integer>(sc.nextInt());
        Holder<Integer> d = new Holder<Integer>(sc.nextInt());

        out.println(a + " " + b + " " + c + " " + d);
        swap(a, b);
        swap(c, d);
        swap(b, c);
        out.println("A: " + a);
        out.println("B: " + b);
        out.println("C: " + c);
        out.println("D: " + d);
    }

    static <T> void swap (Holder<T> x, Holder<T> y) {
        T c = x.getValue();
        x.setValue(y.getValue());
        y.setValue(c);
    }
}