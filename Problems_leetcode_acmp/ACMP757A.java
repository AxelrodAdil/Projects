package Solutions;

import java.util.Scanner;

public class ACMP757A {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int c = sc.nextInt();
        int h = sc.nextInt();
        int o = sc.nextInt();
        System.out.println(aBc(c,h,o));
    }

    public static int aBc(int c, int h, int o){
        if(c<2 || h<6 || o<1) return 0;
        int c1 = c/2;
        int h1 = h/6;
        int abc = Math.min(Math.min(c1,h1),o);
        return abc;
    }
}