package Solutions;

import java.util.Scanner;

public class ACMP354 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x = sc.nextInt();
        for(int i=2; (long) i*i <= x;) {
            if (x%i==0) {
                x /= i;
                System.out.print(i+"*");
            } else {
                i++;
            }
        }
        System.out.print(x);
    }
}