package Solutions;

import java.util.Scanner;

public class ACMP546 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int rn = (n+3)/4 *4;
        int b = 1;
        int c = rn;
        for(int i=1; i<=rn/4; i++){
            System.out.print(i+" 1 ");
            if(c<=n){
                System.out.print(c);
            } else {
                System.out.print(0);
            }
            System.out.print(" ");
            System.out.println(b);
            b++;
            c--;

            System.out.print(i+" 2 ");
            if(b<=n){
                System.out.print(b);
            } else {
                System.out.print(0);
            }
            System.out.print(" ");
            if(c<=n){
                System.out.println(c);
            } else {
                System.out.println(0);
            }
            System.out.println();
            b++;
            c--;
        }
        System.out.println();
    }
}