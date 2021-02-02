package Adil_Sept;

import java.util.Scanner;

public class PLaT_3seminar_10 {
    static Scanner sc = new Scanner(System.in);
/*
5
2 4 6 7 -5
5
*/
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int y = sc.nextInt();
        double sumA = 0;
        double bestSum = 0;
        int bestIndex = 0;
        for (int i = 1; i < n; i++){
            sumA = ((double)(arr[i-1] + arr[i]))/2;
            if (y >= sumA && sumA > bestSum){
                bestSum = sumA;
                bestIndex = i;
            }
        }

        System.out.println(arr[bestIndex-1] + " " + arr[bestIndex]);

        /*int sum1 = 0, temp1 = 0, sum2 = 0;
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i-1] < arr[i] && arr[i] <= y){
                maxIndex = i;
                temp1++;
            } else if (arr[i-1] >= arr[i] && arr[i] <= y){
                maxIndex = i;
                temp1++;
            }
        }
        int ans1 = 0, ans2 = 0;
        for (int i = 0; i < maxIndex; i++){
            sum1 += arr[i];
        }

        for (int i = 0; i < maxIndex-1; i++){
            sum2 += arr[i];
        }
        ans1 = (sum1)/temp1;
        ans2 = sum2/(temp1-1);
        System.out.println(arr[maxIndex-1] + " " + arr[maxIndex]);
        System.out.println(ans1 + " " + ans2);*/
    }
}
