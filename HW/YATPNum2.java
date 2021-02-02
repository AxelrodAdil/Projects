package Adil_Sept;

import java.io.PrintWriter;
import java.util.Scanner;

public class YATPNum2 {
    /**
     * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597,
     * 2584, 4181, 6765, 10946, 17711, ...
     *
     *
     * A natural number N is a Fibonacci number if and only if 5N ^ {2} +4 or 5N ^ {2} -4 is a square
     *
     * In 1964 J. H. E. Cohn proved that the only exact squares
     * among the Fibonacci numbers are the Fibonacci numbers with indices 0, 1, 2, 12:
     */

    static long recurFib(long n) { //Binet's formula --- golden ratio
        // f(x) = ((1+./5)/2)^n - (1-(1+./5)/2)^n
        final long start = System.nanoTime();

        double root5 = Math.sqrt(5);
        double f1 = (1 + root5) / 2;
        double f2 = 1 - f1;
        double value = (Math.pow(f1, n) - Math.pow(f2, n)) / root5;
        final double elapsedTimeInSec = (System.nanoTime() - start) * 1.0e-9;
        System.out.println(elapsedTimeInSec + " seconds");
        return ((long) (value + 0.5));
    }

    private static boolean isFibNum(long num) {
        final long start = System.nanoTime();

        double temp = 5 * num * num - 4;
        double temp1 = 5 * num * num + 4;
        double sq = (long)Math.sqrt(temp);
        double sq1 = (long)Math.sqrt(temp1);

        final double elapsedTimeInSec = (System.nanoTime() - start) * 1.0e-9;
        System.out.println(elapsedTimeInSec + " seconds");
        //System.out.println(sq); System.out.println(sq1);
        return sq * sq == temp || sq1 * sq1 == temp1;
    }

    void solve(Scanner sc, PrintWriter out){
        long x = sc.nextLong();
        //System.out.println(recurFib(x));

        if (isFibNum(x)){
            out.println("YES");
            return;
        }
        out.println("NO");
    }

    void run (){
        try(Scanner sc = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)){
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new YATPNum2().run();
    }
}