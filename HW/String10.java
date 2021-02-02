import java.util.Scanner;

public class String10 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String string1 = scanner.nextLine();
        StringBuilder input1 = new StringBuilder();
        input1.append(string1);
        input1 = input1.reverse();
        System.out.println(input1);
    }
}