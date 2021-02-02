import java.util.Scanner;

public class String45 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String stringWords = scanner.nextLine();
        String[] arrStringWords = stringWords.split(" ", 100);

        int minWords = stringWords.length();
        String minWordIs = "";
        for (int i = 0; i < arrStringWords.length; i++){
            if (arrStringWords[i].length() < minWords){
                minWords = arrStringWords.length;
                minWordIs = arrStringWords[i];
            }
        }

        System.out.println(minWordIs);
    }
}