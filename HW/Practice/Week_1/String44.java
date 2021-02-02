package Practice.Week_1;

import java.util.Scanner;
/*
Дана строка, состоящая из русских слов,
набранных заглавными буквами и разделенных пробелами
(одним или несколькими).
Найти количество слов, которые содержат ровно три буквы «А».
*/

public class String44 {
/*
input: АСТАНА Алматы   АМСТЕРДАМ  Астрахань АТЛАНТА
output: 2
*/
    void solve(Scanner sc) {
        String str = sc.nextLine();
        String[] arrStr = str.split("\\s+");
        int count = 0;
        int words = 0;

        for (int i = 0; i < arrStr.length; i++) {
            for (int j = 0; j < arrStr[i].length(); j++) {
                if (arrStr[i].charAt(j) == 'А') {    //ASCII --- 192
                    count++;
                }
            }
            if (count == 3){
                words++;
            }
            count = 0;
        }

        System.out.println(words);
    }

    void run() {
        try (Scanner sc = new Scanner(System.in)) {
            solve(sc);
        }
    }

    public static void main(String[] args) {
        new String44().run();
    }
}