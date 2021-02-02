package Solutions;

import java.util.Scanner;

public class ACMP118 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int ks = sc.nextInt();
        int pos = 0;
        for(int i=1; i<=n; i+=1){
            pos = (ks+pos)%i;
        }
        System.out.println(pos+1);
    }
}