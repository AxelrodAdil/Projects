package Adil_Sept;

import java.util.Scanner;

public class PLaT_3seminar_9 {
    static Scanner sc = new Scanner(System.in);
/*
7
-6 1 7 16 -9 -3 -1
*/
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        double sumPlus = 0;
        int tempPlus = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] > 0){
                tempPlus++;
                sumPlus += arr[i];
            }
        }

        int b = (int)(sumPlus/tempPlus);

        int count = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] < b){
                System.out.print(arr[i] + " ");
                count++;
            }
        }
        System.out.println("\n" + "Count: " + count);
    }
}
