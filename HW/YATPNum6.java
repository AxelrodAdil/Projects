package Adil_Sept;

import java.math.BigInteger;
import java.util.Scanner;

public class YATPNum6 {
    static Scanner sc = new Scanner(System.in);

    public static boolean isMersenne(int n) {
        // If it is mersenne (i.e. 2^n -1) then n + 1 will have just ONE set bit.
        return (BigInteger.valueOf(n+1).bitCount() == 1);

    }

    static void BitCount_BigInteger (){
        int count = 0;
        for ( int i = 1; i < 100; i++) {
            if (isMersenne(i)) {
                System.out.println(i + " is mersenne!");
                count += 1;
            }
        }
        System.out.println("There are "+count);
    }

    public static void main(String[] args) {
        int x = sc.nextInt();
        for (int i = 0; i < x; i++){
            if (x == Math.pow(2, i) - 1){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");

        //BitCount_BigInteger();
    }
}