package Practice.Week_1;

import java.util.Scanner;
/*
Дан символ C и строки S, S0.
Перед каждым вхождением символа C в строку S вставить строку S0.
*/
public class String29 {
/*
input: e
I love
 Kaznu
output: I love Kaznu
*/
    void solve(Scanner sc) {
        char c = sc.nextLine().charAt(0);
        String s = sc.nextLine();
        String s0 = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            if (s.charAt(i) == c) System.out.print(s0);
        }
    }

    void run() {
        try (Scanner sc = new Scanner(System.in)) {
            solve(sc);
        }
    }

    public static void main(String[] args) {
        new String29().run();
    }
}