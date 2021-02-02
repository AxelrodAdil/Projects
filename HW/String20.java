package Solutions;

import java.util.Scanner;

public class String20 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        String string1 = Integer.toString(n);
        char [] c = new char [string1.length()];
        for (int e = 0; e < string1.length(); e++){
            c[e] = string1.charAt(e);
        }

        for (char abc : c){
            System.out.print(abc + " ");
        }
    }
}