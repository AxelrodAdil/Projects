package Solutions;

import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP66 {

    void solve(Scanner sc, PrintWriter out) {
        String strMain = "qwertyuiopasdfghjklzxcvbnmq";
        String str = sc.nextLine();
        char[] c = new char[strMain.length()];
        char[] a = new char[str.length()];
        Character resultB = str.charAt(0);

        for (int i = 0; i < 29; i++) {
            Character resultA = strMain.charAt(i);
            if (resultA == resultB) {
                out.println(strMain.charAt(i+1));
                break;
            }
        }
    }

    void run() {
        try (Scanner sc = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new ACMP66().run();
    }
}