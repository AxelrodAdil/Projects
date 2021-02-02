package Adil_Sept;

import java.util.Scanner;

public class PLaT_3seminar_11 {
    static Scanner sc = new Scanner(System.in);
/*
5
2 3 5 7 11

5
2 3 5 11 13
*/
    public static boolean checkSimple(int i){
        if (i<=1)
            return false;
        else if (i <=3)
            return true;
        else if (i%2==0 || i %3 ==0)
            return false;
        int n = 5;
        while (n*n <=i){
            if (i % n ==0 || i % (n+2) == 0)
                return false;
            n=n+6;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n+10];
        for (int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++){
            if(checkSimple(arrA[i])) System.out.print(arrA[i] + " ");
        }
        System.out.println("-------");
        boolean b = true;
        int temp = 0;
        for (int Pn = 2; Pn <= arrA[n-1]; Pn++) {
            for (int i = 2; i < Pn; i++) {
                if (Pn % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b){
                System.out.print(Pn + " ");
                arrB[temp++] = Pn;
            } else {
                b = true;
            }
        }


        int countTemp = 0;
        for (int i = 0; i < n; i++){
            if (arrA[i] == arrB[i]){
                countTemp++;
            }
        }
        if (n == countTemp){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}