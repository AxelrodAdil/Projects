package Adil_Sept.AdilCheatsJava;

import java.util.Scanner;

public class PLaT_3W_8 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt(), n = sc.nextInt(), x, k = 1;

        for(int i = 1; i <= n; ++i){
            x = sc.nextInt();
            if(x != a) k++;
            else{
                System.out.println("The number A is at position" + k + " on chain X");
                return;
            }
            if(k == n) System.out.println('0');
        }
        System.out.println("END");
    }
}
