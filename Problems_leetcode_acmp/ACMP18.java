package Solutions;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class ACMP18 {

    static BigInteger factorial(int num){
        BigInteger result = BigInteger.valueOf(1);

        for(int i = 2; i<=num; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    void solve(Scanner sc, PrintWriter out){
        int n  = sc.nextInt();
        out.println(factorial(n));
    }

    void run(){
        try(Scanner sc = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)){
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new ACMP18().run();
    }
}