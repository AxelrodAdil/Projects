package Adil_Sept;

import java.util.Arrays;
import java.util.Scanner;

/*
7
1 1 3 5 5 1 5
*/
public class PLaT_3seminar_8 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
           if (arr[i-1] == arr[i]){
               System.out.print(arr[i] + " ");
               count++;
           }
        }

        System.out.println("Count: " + count);
    }
}
