package Solutions;

import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;
import static java.nio.charset.StandardCharsets.*;

public class AbrString15 {
    /*
    Дана строка. Подсчитать общее количество содержащихся
    в ней строчных латинских и русских букв.
    Example: ТрУ000111FaLsE;
     */

    void solve(Scanner sc, PrintWriter out) {
        Charset charset = Charset.forName("CP1251");

        String str = sc.nextLine();
        int count = 0;

        byte[] byteEng = str.getBytes(US_ASCII);
        for (byte a : byteEng) {
            if (a >= 65 & a <= 90) {
                count++;
            } else if(a >= 97 & a<= 122){
                count++;
            }
        }

        byte[] byteRussian = str.getBytes(charset);
        for (byte b : byteRussian) {
            if (b+256 >= 192 & b+256 <= 255) {
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
        new AbrString15().run();
    }
}