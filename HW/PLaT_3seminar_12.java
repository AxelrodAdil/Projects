package Adil_Sept;

import java.util.Scanner;

public class PLaT_3seminar_12 {
/*
5
2 4 6 8 10

6
2 4 6 8 10 12

5
4 1 8 7 12
*/
    static Scanner sc = new Scanner(System.in);
    static void writeThis (int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        boolean bool = true;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i]%2 != 0) { bool = false; }
        }

        if (bool){
            for (int i = 0; i < n/2; i++) {
                int temp = arr[n-i-1];
                arr[n-i-1] = arr[i];
                arr[i] = temp;
            }

        } else {
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 1) {
                    arr[i] = 0;
                }
            }
        }
        writeThis(arr);
    }
}