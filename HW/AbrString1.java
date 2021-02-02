package HW;

import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class AbrString1 {

    /*
    ASCII, UNICODE;
    Example: 'A' == 65 or 0100 0001;

    Дан символ C. Вывести его код (то есть номер в кодовой таблице).

    References: http://school497.ru/download/u/02/les10/les.html;
    https://ru.wikipedia.org/wiki/ASCII;
     */

    void solve(Scanner sc, PrintWriter out) {
        //java.nio.charset.Charset charset = java.nio.charset.Charset.forName("ASCII");
        java.nio.charset.Charset charset = StandardCharsets.US_ASCII;
        Charset charset1 = Charset.forName("CP1251");

        String str = sc.nextLine();

        byte[] byteArr1 = str.getBytes(charset1);
        for (byte b : byteArr1) {
            if (b < 0) {
                out.println(b + 256);
                return;
            }
        }


        byte[] byteArr = str.getBytes(charset);
        for (byte b : byteArr) {
            out.println(b);
        }
    }

    void run() {
        try (Scanner sc = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new AbrString1().run();
    }
}