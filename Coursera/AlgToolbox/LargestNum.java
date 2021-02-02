package Coursera.AlgUCSanDiego.AlgToolbox;
//DONE
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LargestNum {

    static String largestN (int [] arrInt) {
        String[] arrString = new String[arrInt.length];
        for (int i = 0; i < arrInt.length; i++) {
            arrString[i] = String.valueOf(arrInt[i]);
        }

        Arrays.sort(arrString,
    new Comparator<String>() {
    public int compare(String a, String b) {
    return (b + a).compareTo(a + b); }
        });

        StringBuilder myStringB = new StringBuilder();
        for (String s : arrString) {
            myStringB.append(s);
        }
        while (myStringB.charAt(0) == '0' && myStringB.length() > 1)
            myStringB.deleteCharAt(0);
        return myStringB.toString();
    }

    void solve(Scanner sc, PrintWriter out) {
        int n = sc.nextInt();
        int [] arrInt = new int [n];
        for (int i = 0; i < n; i++){
            arrInt[i] = sc.nextInt();
        }
        out.println(largestN(arrInt));
    }

    void run() {
        try (Scanner sc = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new LargestNum().run();
    }
}