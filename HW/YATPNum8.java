package Adil_Sept;

import java.io.PrintWriter;
import java.util.Scanner;

public class YATPNum8 {  //YATPNum9
//Done
    static void solve (Scanner sc, PrintWriter out){
        int n = sc.nextInt();
        for (int m = 2; m < n; m++) {
            if ((m-1) * m * (m + 1) == n) {
                System.out.println(m-1);
                System.out.println(m);
                System.out.println(m+1);
            }
        }
    }

    void run() {
        try (Scanner sc = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new YATPNum8().run();
    }
}