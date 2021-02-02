package Solutions;

import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP6 {

    static void foo(int x1, int x2, int y1, int y2) {
        if (Math.abs(x1 - x2) == 2 && Math.abs(y1 - y2) == 1
                || Math.abs(x1 - x2) == 1 && Math.abs(y1 - y2) == 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static int yCE(char indexE) {
        if (indexE == 'A') {
            return 1;
        } else if (indexE == 'B') {
            return 2;
        } else if (indexE == 'C') {
            return 3;
        } else if (indexE == 'D') {
            return 4;
        } else if (indexE == 'E') {
            return 5;
        } else if (indexE == 'F') {
            return 6;
        } else if (indexE == 'G') {
            return 7;
        } else if (indexE == 'H') {
            return 8;
        } else {
            return -1;
        }
    }

    void solve(Scanner sc, PrintWriter out) {
        String moveKnight = sc.nextLine();
        char[] indexE = new char[moveKnight.length()];
        for (int i = 0; i < moveKnight.length(); i++) {
            indexE[i] = moveKnight.charAt(i);
        }

        if(moveKnight.length()!=5){
            out.println("ERROR");
            return;
        }

        int y1 = yCE(indexE[0]);
        int y2 = yCE(indexE[3]);
        int x1 = Character.getNumericValue(indexE[1]);
        int x2 = Character.getNumericValue(indexE[4]);

        if (indexE[2] != '-') {
            out.println("ERROR");
            return;
        } else if (y1 <= 0 | y1 >= 9) {
            out.println("ERROR");
            return;
        } else if (y2 <= 0 | y2 >= 9) {
            out.println("ERROR");
            return;
        } else if (x1 <= 0 | x1 >= 9) {
            out.println("ERROR");
            return;
        } else if (x2 <= 0 | x2 >= 9) {
            out.println("ERROR");
            return;
        }

        foo(x1, x2, y1, y2);
    }

    void run() {
        try (Scanner sc = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new ACMP6().run();
    }
}