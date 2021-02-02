package HW;

import java.io.PrintWriter;
import java.util.Scanner;

public class AbrString5 {
    /*
        Дано целое число N (1 ≤ N ≤ 26). Вывести N последних строчных (то есть маленьких)
        букв латинского алфавита в обратном порядке (начиная с буквы «z»).
    */

    void solve (Scanner sc, PrintWriter out){
        int n = sc.nextInt();
        for(int i = 122; i > 122 - n ; i--){
            out.println((char)i);
        }
    }

    void run(){
        try(Scanner sc = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)){
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new AbrString5().run();
    }
}