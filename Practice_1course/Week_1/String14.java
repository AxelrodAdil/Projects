package Practice.Week_1;

import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
/*
Дана строка. Подсчитать количество содержащихся
в ней прописных латинских букв.
*/
public class String14 {
/*
input:
Количество содержащихся в ней nice прописных латинских букв "abc".
output:
7
*/
    void solve (Scanner sc, PrintWriter out){
        String str = sc.nextLine();
        int count = 0;
        java.nio.charset.Charset charset = StandardCharsets.US_ASCII;

        /*byte[] byteArr1 = str.getBytes(charset1);
        for (byte b : byteArr1) {
            if (b < 0) {
                out.println(b+256);
                return;
            }
        }*/

        byte[] byteArr = str.getBytes(charset);
        for (byte b : byteArr) {
            if(65 <= b && b <= 90 || 97 <= b && b <= 122){
                count++;
            }
        }

        out.println(count);
    }

    void run() {
        try (Scanner sc = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new String14().run();
    }
}