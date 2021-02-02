package Solutions;

import java.util.Scanner;

public class ACMPcircle123 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num123 = sc.nextInt();
        int s = 0;
        for(int i=0; i<num123; i++){
            s+=(int)(Math.pow(-1,i)/factorial(i));
        }
        System.out.println(s);
    }

    public static int factorial(int num){
        if(num<=1) return 1;
        return num*factorial(num-1);
    }
}