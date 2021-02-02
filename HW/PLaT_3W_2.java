package Adil_Sept.AdilCheatsJava;

import java.util.Scanner;

public class PLaT_3W_2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt(), y = 1;
        if(n%2 != 0){   //tak
            for(int i = 1; i <= n; i ++){
                y *= i;
            }
        } else {  //jup
            for(int i = 2; i <= n; i += 2){
                y *= i;
            }
        }

        System.out.println("Y = " + y);
    }
}