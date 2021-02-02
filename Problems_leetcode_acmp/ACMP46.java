package Solutions;

import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP46 {

    void solve(Scanner sc, PrintWriter out) {
        int n = sc.nextInt();
        StringBuilder str = new StringBuilder("2.71828182845904523536028750");

        if (n == 0) {
            out.println(3);
            return;
        }

        char lastNumber = str.charAt(n+1);
        char afterLN = str.charAt(n+2);
        if('5'<= afterLN && afterLN <= '9'){
            lastNumber++;
        }
        str.setCharAt(n+1, lastNumber);

        out.println(str.substring(0,n+2));
    }

    void run(){
        try(Scanner sc = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)){
            solve(sc,out);
        }
    }

    public static void main(String[] args) {
        new ACMP46().run();
    }
}