package Adil_Sept;

import java.util.Scanner;

public class PLaT_3seminar_7 {
    static Scanner sc = new Scanner(System.in);
/*
5
-5 1 2 5 -7

5
-5 -7 1 2 5

5
1 -2 -5 -3 2

7
1 -2 -5 -3 2 4 5
*/
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxLength = 0;
        int temp = 0;
        int maxIndex = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] > 0){
                temp++;
            } else {
                temp = 0;
            }

            if (temp > maxLength) {
                maxLength = temp;
                maxIndex = i;
            }
        }
        System.out.println(maxLength);

        for (int i = maxIndex-maxLength+1; i <= maxIndex; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
