package Solutions;

import java.util.Scanner;

public class Aabr3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            for (int j=a; j<=i; j++){
                System.out.print(i +"   ");  }
            System.out.println();
        }
    }
}