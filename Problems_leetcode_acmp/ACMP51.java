package Solutions;

import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP51 {

    void solve(Scanner sc, PrintWriter out) {
        int n = sc.nextInt();
        String str = sc.nextLine();
        int k = str.length()-1;
        long result = 1;
        for(int i = n; i >= 1; i-=k){
            result = result*i;
        }
        out.println(result);
    }

    void run(){
        try(Scanner sc = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)){
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new ACMP51().run();
    }
}