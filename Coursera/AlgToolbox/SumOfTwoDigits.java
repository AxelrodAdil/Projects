package Coursera.AlgUCSanDiego.AlgToolbox;
//DONE
import java.io.PrintWriter;
import java.util.Scanner;

public class SumOfTwoDigits {

    static int AplusB(int a, int b) {
        return a + b;
    }

    void solve(Scanner sc, PrintWriter out) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        out.println(AplusB(a, b));
    }

    void run() {
        try (Scanner sc = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new SumOfTwoDigits().run();
    }
}