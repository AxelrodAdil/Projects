package Solutions;

import java.util.Scanner;

public class ACMP10 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        for(int x=-100; x<=100; x++){
            if(a*(x*x*x) + b*(x*x) + c*x + d==0){
                System.out.println(x+" ");
            }
        }
        System.out.println();
    }
}