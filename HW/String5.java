import java.util.Scanner;

public class String5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        int m = Integer.parseInt(n);
        for (int i = 122; i > 122 - m; i--) {
            System.out.println((char) i);
        }
    }
}