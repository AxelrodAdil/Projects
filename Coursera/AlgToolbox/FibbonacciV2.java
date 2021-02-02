package Coursera.AlgUCSanDiego.AlgToolbox;
//DONE
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class FibbonacciV2 {

    static long recurFib(int n, int m) { //Binet's formula
        double root5 = Math.sqrt(5);
        BigDecimal BigRoot5 = new BigDecimal(root5);
        double f1 = (1 + root5) / 2;
        BigDecimal BigF1 = new BigDecimal(f1);
        double f2 = 1 - f1;
        BigDecimal BigF2 = new BigDecimal(f2);

        BigDecimal halfStep = new BigDecimal("0.5");
        BigDecimal a1 = BigF1.pow(n);
        BigDecimal a2 = a1.subtract(BigF2.pow(n));
        BigDecimal BigValue = a2.divide(BigRoot5);
        BigDecimal aaa = BigValue.add(halfStep);

        BigInteger BiigFValue = aaa.toBigInteger();
        String abc = BiigFValue.toString();
        String pressF = abc.substring(abc.length()-1);
        int GG = Integer.parseInt(pressF);
        return GG;
    }
/*
    static long recurFib (long n, long m){
        long prev = 0;
        long cur = 1;
        for(long  i = 0; i < n-1; i++){
            long newCur = prev%m;
            prev = cur%m;
            cur = (newCur+cur)%m;
        }
        return (int)cur;
    }
*/
    void solve(Scanner sc, PrintWriter out) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        out.println(recurFib(n, m));
    }

    void run() {
        try (Scanner sc = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new FibbonacciV2().run();
    }
}