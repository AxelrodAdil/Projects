package Solutions;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class ACMP40 {

    void solve(Scanner sc, PrintWriter out){
        int n = sc.nextInt();
        BigInteger tWo;
        tWo = new BigInteger("2");
        BigInteger result = tWo.pow(n);
        out.println(result);
    }

    void run(){
        try (Scanner sc = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new ACMP40().run();
    }
}