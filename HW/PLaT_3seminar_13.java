package Adil_Sept;

import java.util.Scanner;

public class PLaT_3seminar_13 {
    static Scanner sc = new Scanner(System.in);
/*
5
1 2 3 4 5
2
4
*/
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = 0;
        int sum = 0;

        for (int i = 0; i < n; i++){
            if (a <= arr[i] && arr[i] <= b) {
                sum += arr[i];
                temp++;
            }
        }

        double arithmetical_mean = (double)sum/temp;
        System.out.println("Sum: " + sum);
        System.out.println("Arithmetical mean: " + arithmetical_mean);
    }
}