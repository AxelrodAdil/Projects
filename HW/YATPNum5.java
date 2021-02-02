package Adil_Sept;

import java.util.Scanner;

public class YATPNum5 {

    static int NOD_GCD (int a, int b){ //Euclid's Algorithm
        while (b !=0) {
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }

    /*static int[] Factorization (int x, int[] arr){
        int k = 0;
        for (int i = 2; i <= x; i++) {
            for (int j = 2; j <= i; j++) {
                if (x % j == 0) {
                    arr[k] = j;
                    k++;
                    x = x / j;
                }
            }
        }
        return arr;
    }*/

    static void solve (Scanner sc){
        int x = sc.nextInt();
        int y = sc.nextInt();

        /*int[] arrX = new int[5];
        int[] arrY = new int[5];
        arrX = Factorization(x, arrX);
        arrY = Factorization(y, arrY);*/

        int firstNum = NOD_GCD(x, y);
        if (firstNum == 1){ System.out.println("NO"); return;}
        else {
            System.out.println(firstNum + ", 1"); }

        /*for (int i = 0; i < arrX.length; i++){
            if (arrX[i] == arrY[i]){
                System.out.println(arrX[i] + ", 1");
                break;
            }
        }*/
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}