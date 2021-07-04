package Practice.Week_1;

import java.util.Scanner;
/*
Дана строка-предложение на русском языке.
Вывести самое длинное слово в предложении.
Если таких слов несколько, то вывести первое из них.
Словом считать набор символов, не содержащий пробелов,
знаков препинания и ограниченный пробелами,
знаками препинания или началом/концом строки.
*/

public class String55 {
/*
input: Вывести самое длинное слово в предложении.
output: длинное
*/
    void solve(Scanner sc) {
        String str = sc.nextLine();
        String[] arrStr = str.split("\\s+");
        String[] words = new String[arrStr.length];
        int temp = 0;

        for (int i = 1; i < arrStr.length - 1; i++) {      //началом/концом строки
            int right = 0;
            for (int j = 0; j < arrStr[i].length(); j++) {
                if (arrStr[i].charAt(j) == ' '
                        || arrStr[i].charAt(j) == ','
                        || arrStr[i].charAt(j) == '.'
                        || arrStr[i].charAt(j) == ':'
                        || arrStr[i].charAt(j) == '!'
                        || arrStr[i].charAt(j) == '?'
                        || arrStr[i].charAt(j) == ';'
                        || arrStr[i].charAt(j) == '-') {
                    right++;
                }
            }

            if (right == 0) {
                words[temp] = arrStr[i];
                temp++;
            }
        }

        int index = 0;
        int max_Length = 0;
        for (int i = 0; i < temp; i++) {
            int l = words[i].length();
            if (l > max_Length) {
                max_Length = words[i].length();
                index = i;
            }
        }

        System.out.println(words[index]);
    }

    void run() {
        try (Scanner sc = new Scanner(System.in)) {
            solve(sc);
        }
    }

    public static void main(String[] args) {
        new String55().run();
    }
}