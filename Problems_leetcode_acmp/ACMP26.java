package Solutions;

import java.util.Scanner;
public class ACMP26 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int r1 = sc.nextInt();

        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int r2 = sc.nextInt();

        int A = (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
        int B1 = (r1+r2)*(r1+r2);
        int B2 = (r1-r2)*(r1-r2);
        if(B2<= A && A <= B1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        System.out.println();
    }
}