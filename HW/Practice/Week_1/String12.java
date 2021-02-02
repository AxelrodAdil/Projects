package Practice.Week_1;

import java.io.PrintWriter;
import java.util.Scanner;
/*
Дана непустая строка S и целое число N (> 0).
Вывести строку, содержащую символы строки S,
между которыми вставлено по N символов «*» (звездочка).
*/
public class String12 {
/*
input: Решебник Абрамяна М. Э
4
output:
Решебник **** Абрамяна **** М. **** Э ****
*/

    void solve (Scanner sc, PrintWriter out){
        String str1 = sc.nextLine();
        String[] arrStr = str1.split(" ");
        int n = sc.nextInt();

        //пробел --- символ.
        String str2 = "";
        for (int i = 0; i < arrStr.length; i++){
            str2 = str2 + " " + arrStr[i] + " ";
            for (int j = 0; j < n; j++){
                str2 = str2 + "*";
            }
        }
        System.out.println(str2.substring(1));
    }

    void run() {
        try (Scanner sc = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new String12().run();
    }
}