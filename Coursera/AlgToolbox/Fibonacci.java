package Coursera.AlgUCSanDiego.AlgToolbox;
//DONE
import java.io.PrintWriter;
import java.util.Scanner;

public class Fibonacci {
    // 0 1 1 2 3 5 8 13 21 ...

    static long recurFib(int n) { //Binet's formula
        // f(x) = ((1+./5)/2)^n - (1-(1+./5)/2)^n
        double root5 = Math.sqrt(5);
        double f1 = (1 + root5) / 2;
        double f2 = 1 - f1;
        double value = (Math.pow(f1, n) - Math.pow(f2, n)) / root5;
        return ((long) (value + 0.5));
    }

    /*
    static long recurFib (int n){
        int [] arr = new int[n+3];
        arr [0] = 0;
        arr [1] = 1;
        for(int i = 2; i < n+2; i++){
            arr [i] = arr [i-1] + arr[i-2];
        }
        return arr[n];
    }
     */

    /*
    static long recurFib (long n){
        if(n<=1) return 1;
        return recurFib(n-1) + recurFib(n-2);
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
        new Fibonacci().run();
    }
}