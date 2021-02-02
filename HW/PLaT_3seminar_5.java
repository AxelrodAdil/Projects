package Adil_Sept;

import java.util.Arrays;
import java.util.Scanner;

public class PLaT_3seminar_5 {
    static Scanner sc = new Scanner(System.in);
/*
3
1 3 5
*/
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arrN = new int[n];
        for (int i = 0; i < n; i++){
            arrN[i] = sc.nextInt();
        }
        Arrays.sort(arrN);
        //int min = arrN[0];
        //int max = arrN[n-1];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int q1 = 0; q1 < n; q1++){
            if (max < arrN[q1]){
                max = arrN[q1];
            }
        } //System.out.println(max);

        for (int q2 = 0; q2 < n; q2++){
            if (min > arrN[q2]){
                min = arrN[q2];
            }
        } //System.out.println(min);
        int count = 0;
        for (int i = min; i < max; i++){
            for (int j = 0; j < n; j++){
                if(i == arrN[j]){
                    count++;
                }
            }
            if (count == 0){
                System.out.print(i + " ");
            }
            count = 0;
        }
        System.out.println();
    }
}
