package Adil_Sept.AdilCheatsJava;

import java.util.Scanner;

//PLaT_3W_1
public class PLaT_3W_1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i){
            if(n%i == 0)
                System.out.print(i + " ");
        }

        System.out.println();
    }
}