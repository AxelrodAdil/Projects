import java.util.Scanner;

public class Reverse {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.nextLine();
        String patt = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            patt = patt + c;
        }

        String reversePatt = "";
        for (int j = str.length() - 1; j >= 0; j--) {
            char c2 = patt.charAt(j);
            reversePatt = reversePatt + c2;
        }
        System.out.println(reversePatt);
    }
}