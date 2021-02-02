package HW;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AbrFile1 {
/*
Дана строка S. Если S является допустимым именем файла,
то создать пустой файл с этим именем и вывести True.
Если файл с именем S создать нельзя, то вывести False.
*/

    void solve(Scanner sc, PrintWriter out) {
        String str = sc.nextLine();
        try {
            java.io.File myFile = new File(str);
            if(myFile.createNewFile()){
                out.println("True");
            } else {
                out.println("False");
            }
        } catch (IOException e) {
            out.println("False");
            e.printStackTrace();
        }
    }

    void run() {
        try (Scanner sc = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new AbrFile1().run();
    }

     /*
    private static final char[] ILLEGAL_Java =
            { '/', '\n', '\r', '\t', '\0', '\f',
                    '`', '?', '*', '\\', '<', '>', '|',
                    '\"', ':', '_', '%', '^', '&', '(', ')', '=', '+','-'};
    //As of Java 9, '_' is a keyword, and may not be used as an identifier

    private static final String[] ILLEGAL_Windows =
            {"aux", "com1", "com2", "com3", "com4",
                "com5", "com6", "com7", "com8", "com9", "con", "lpt1", "lpt2",
                "lpt3", "lpt4", "lpt5", "lpt6", "lpt7", "lpt8", "lpt9", "nul", "prn"};
     */
}