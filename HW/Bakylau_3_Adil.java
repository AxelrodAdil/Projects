package PLaT;

import java.util.Scanner;

public class Bakylau_3_Adil {
    public static final Scanner sc = new Scanner(System.in);
    /**
     * Created by Adil Myktybek
     * on 10.11.2020, 08:20.
     */

    /**
     * Integer.toString(n,2)
     * Integer.toString(n,8)
     * Integer.toString(n,16)
     */


    static void solve3 (int a) {
        int b;
        String temp = "";
        while (a != 0) {
            b = a % 2;
            temp = b + temp;
            a = a / 2;
        }
        System.out.print(temp);
    }

    static void solve2 (int x){
        StringBuilder str = new StringBuilder();
        while (x != 0) {
            str.append(x % 2);
            x /= 2;
        }
        System.out.print(str.reverse().toString());
    }


    private static void printBinaryform(int number) {
        int remainder;
        if (number <= 1) {
            System.out.print(number);
            return;
        }
        remainder = number % 2;
        printBinaryform(number >> 1);
        System.out.print(remainder);
    }

    static void checkIt(int number) {
        if (number < 0) {
            System.out.println("Error: Not a positive integer");
        } else {
            System.out.print("Convert to binary is:");
            printBinaryform(number);
        }
    }

    public static void main(String[] args) {
        int[] arr = {37, 73, 25, 16, 5, 77, 9, 10, 99, 125};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Current: " + arr[i]);
            checkIt(arr[i]);
            System.out.println(".");
            solve2(arr[i]);
            System.out.println(".");
            solve3(arr[i]);

            System.out.println(".\nNEXT\n");
        }
    }
}