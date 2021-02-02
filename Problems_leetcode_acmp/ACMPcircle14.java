package Solutions;

import java.util.Scanner;

public class ACMPcircle14 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x = sc.nextInt();
        int s = 0;
        for(int i=1; i<=x; i++){
            s+=2*i-1;
        }
        System.out.println(s);
    }
}