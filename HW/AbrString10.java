package HW;

import java.io.PrintWriter;
import java.util.Scanner;
import java.lang.*;

public class AbrString10 {
    /*
        Дана строка. Вывести строку, содержащую те же символы,
        но расположенные в обратном порядке.
     */

    void solve (Scanner sc, PrintWriter out){
        String str = sc.nextLine();

        StringBuilder input1 = new StringBuilder();
        input1.append(str);
        input1 = input1.reverse();

        out.println(input1);

        /*
        byte [] strBytes = str.getBytes();
        byte [] result = new byte[strBytes.length];
        for(int i = 0; i<strBytes.length; i++){
            result[i] = strBytes[strBytes.length-i-1];
        }
        out.println(new String(result));

        input: Привет Мир
        output: �ѸМ� �ѵвиЀџ�
        */
    }

    void run(){
        try(Scanner sc = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)){
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new AbrString10().run();
    }
}