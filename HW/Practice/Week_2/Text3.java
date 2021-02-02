package Practice.Week_2;

import java.io.*;
import java.util.Scanner;
/*
Дано имя файла и целое число N (0 < N < 27).
Создать текстовый файл с указанным именем и записать в него N строк длины N;
строка с номером K (K = 1,...,N) должна содержать K начальных прописных
(то есть заглавных) латинских букв, дополненных справа символами «*» (звездочка).
Например, для N = 4 файл должен содержать строки «A***»,
«AB**», «ABC*», «ABCD».
*/
public class Text3 {

    void solve (Scanner sc, PrintWriter out){
        String strName = sc.nextLine();
        int n = sc.nextInt();
        String filename = "C:\\Users\\ASUS\\IdeaProjects\\Adil\\" + strName;   //Adil_text_3
        StringBuilder strb;

        try (FileWriter writer = new FileWriter(new File(filename))) {
            for (int i = 0; i < n; i++) {
                strb = new StringBuilder();
                for (int j = 0; j < i + 1; j++) {
                    strb.append((char) (j + 65));     //// ASCII
                }

                for (int j = 1; j < n - i; j++) {
                    strb.append("*");
                }
                writer.write(strb.append("\n").toString());
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
        new Text3().run();
    }
}