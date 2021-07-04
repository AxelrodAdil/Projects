package Practice.Week_2;

import java.io.*;
import java.util.Scanner;
/*
Дан текстовый файл. Вывести первое слово текста наибольшей длины.
Словом считать набор символов,
не содержащий пробелов и ограниченный пробелами или началом/концом строки.
*/

public class Text29 {
/*
input: Adil_text_29
Дан текстовый файл. Вывести первое слово текста наибольшей длины.
output:
наибольшей
*/

    void longest_word_of_text (String str){
        String[] arrStr = str.split("\\s+");
        String[] words = new String[arrStr.length];
        int temp = 0;

        for (int i = 1; i < arrStr.length - 1; i++) {      //началом/концом строки
            words[temp] = arrStr[i];
            temp++;
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

    void solve (Scanner sc, PrintWriter out){
        String strName = sc.nextLine();
        String filename = "C:\\Users\\ASUS\\IdeaProjects\\Adil\\" + strName;   //Adil_text_29
        StringBuilder strb;
        String str = "";

        try {
            FileInputStream myFile = new FileInputStream(filename);
            BufferedReader reader = new BufferedReader(new InputStreamReader(myFile));
            while((str = reader.readLine()) != null) {
                //System.out.println(str);
                longest_word_of_text(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.println();
    }

    void run() {
        try (Scanner sc = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new Text29().run();
    }
}