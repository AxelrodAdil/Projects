package Solutions;

import java.util.Scanner;

public class Aabr {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int a = sc.nextInt();
        int c = 0;
        for (int i=0; i<n; i++){
            c+=Math.pow(a,i);
            System.out.println("kadamdary: "+c);
        }
        System.out.println(c);
    }
}