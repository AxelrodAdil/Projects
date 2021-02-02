import java.util.Scanner;

public class String50 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String string1 = scanner.nextLine();
        String[] words = string1.split("\\s+");

        for (int i = 0; i< words.length; i++){
            System.out.print(words[i] + " ");
        }
        System.out.println();

        int n = words.length;
        String temp;
        for (int i = 0; i < n/2; i++) {
            temp = words[n-i-1];
            words[n-i-1] = words[i];
            words[i] = temp;
        }

        for (int i = 0; i< words.length; i++){
            System.out.print(words[i] + " ");
        }
    }
}