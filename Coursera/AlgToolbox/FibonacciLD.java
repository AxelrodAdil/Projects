package Coursera.AlgUCSanDiego.AlgToolbox;
//DONE
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciLD {
    // 0 1 1 2 3 5 8 13 21 34 55 89 144 ...
    static int recurFib(int n){
        long prev = 0;
        long cur = 1;
        for(long  i = 0; i < n-1; i++){
            long newCur = prev%10;
            prev = cur%10;
            cur = (newCur+cur)%10;
        }
        return (int)cur;
    }

    /*
    static long recurFib(long n) {
        BigInteger prev = new BigInteger("0");
        BigInteger curr = new BigInteger("1");
        for (int i = 0; i < n - 1; i++) {
            BigInteger temp = prev;
            prev = curr;
            curr = curr.add(temp);
        }
        String abc = curr.toString();
        String pressF = abc.substring(abc.length() - 1);
        int GG = Integer.parseInt(pressF);
        return GG;
    }
*/

/*
    static long recurFib(int n) { //Binet's formula
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
 */

    void solve(Scanner sc, PrintWriter out) {
        int n = sc.nextInt();
        out.println(recurFib(n));
    }

    void run() {
        try (Scanner sc = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new FibonacciLD().run();
    }
}