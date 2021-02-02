package Solutions;

import java.math.BigInteger;
import java.util.Scanner;

public class ACMP757 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger c = sc.nextBigInteger();
        BigInteger h = sc.nextBigInteger();
        BigInteger o = sc.nextBigInteger();
        BigInteger c1 = c.divide(BigInteger.valueOf(2));
        BigInteger h1 = h.divide(BigInteger.valueOf(6));
        BigInteger result = c1.min(h1.min(o));
        System.out.println(result);
    }
}