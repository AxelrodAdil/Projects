
import java.io.PrintWriter;
import java.util.Scanner;

public class SOZH_Adil_1RK {

    void solve(Scanner sc, PrintWriter out) {
        int n = sc.nextInt();
        int a = 0;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                out.print(" ");
            }

            for (int k = 0; k <= a * 2; k++) {
                out.print("*");
            }
            out.println();
            a++;
        }
        //out.println(n);
    }

    void run() {
        try (Scanner sc = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new SOZH_Adil_1RK().run();
    }
}