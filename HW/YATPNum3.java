package Adil_Sept;

import java.io.PrintWriter;
import java.util.Scanner;

public class YATPNum3 {
    /**
     * The largest known palindrome number was discovered in 1991 by Harvey Dubner. The expression for it is written as follows:
     * 10^11310 + 46661664 * 10^5652 + 1
     *
     * Obviously, palindrome numbers with their increase become more and more rare in the sequence of natural numbers.
     * If each single-digit number is by definition a palindrome, then in the range from 10 to 1000 there are no more than 10%,
     * and in the range from 1000 to 100,000 there are already about 1%.
     */

    static void PalindromeNum2 (int n){
        int r, sum = 0, temp;
        temp = n;
        while(n > 0){
            r = n%10;  //getting remainder
            sum = (sum*10) + r;
            n = n/10;
        }

        if (temp == sum)
            System.out.println("Palindrome number");
        else
            System.out.println("Not palindrome");
    }

    static void PalindromeNum (int num){
        boolean YorN = true;
        String temp = Integer.toString(num);
        //if the length of the number is 1, the answer is YES
        //if (temp.length() == 1 && num >=0){ System.out.println("YES"); return; }

        int[] arrNum = new int [temp.length()];
        for (int i = 0; i < temp.length(); i++){
            arrNum[i] = temp.charAt(i) - '0';
        }

        for (int i = 0; i < temp.length(); i++){
            //System.out.println("here");
            if (arrNum[i] != arrNum[temp.length()-1-i]){
                YorN = false;
                break;
            }
        }

        if (YorN){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }

    void solve(Scanner sc, PrintWriter out){
        int x = sc.nextInt();
        PalindromeNum(x);
        PalindromeNum2(x);
        out.println();
    }

    void run(){
        try (Scanner sc = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)){
            solve (sc, out);
        }
    }

    public static void main(String[] args) {
        new YATPNum3().run();
    }
}