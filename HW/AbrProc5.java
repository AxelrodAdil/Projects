package Solutions;

import java.io.PrintWriter;
import java.util.Scanner;

/*
Описать процедуру RectPS(x1, y1, x2, y2, P, S),
вычисляющую периметр P и площадь S прямоугольника со сторонами,
параллельными осям координат, по координатам (x1, y1), (x2, y2) его противоположных вершин
(x1, y1, x2, y2 — входные, P и S — выходные параметры вещественного типа).
С помощью этой процедуры найти периметры и площади трех прямоугольников с данными противоположными вершинами.
 */

public class AbrProc5 {
    float RectPS2(float x1, float y1, float x2, float y2, float s) {
        s = Math.abs(x1 - x2) * Math.abs(y1 - y2);
        return s;
    }

    float RectPS1(float x1, float y1, float x2, float y2, float p) {
        p = 2 * (Math.abs(x1 - x2) + Math.abs(y1 - y2));
        return p;
    }

    void solve(Scanner sc, PrintWriter out) {
        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();
        float x2 = sc.nextFloat();
        float y2 = sc.nextFloat();
        float s = 0;
        float p = 0;
        out.println("Square: " + RectPS2(x1, y1, x2, y2, s));
        out.println("Perimetr: " + RectPS1(x1, y1, x2, y2, p));
        //System.err.println("Square: " + RectPS2(x1, y1, x2, y2, s));
        //System.err.println("Perimetr: " + RectPS1(x1, y1, x2, y2, p));
    }

    private void run() {
        try (Scanner sc = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new AbrProc5().run();
    }
}