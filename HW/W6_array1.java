package PLaT;

import java.util.Scanner;

public class W6_array1 {
    static Scanner sc = new Scanner (System.in);
/*
5
1 2 3 4 5 6
 */
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            //arr[i] = (int)(Math.random()*1000);
            arr[i] = sc.nextInt();
        }

        int temposu = 0;
        int tempKemu = 0;
        for (int i = 1; i < n; i++){
            if (arr[i-1] > arr[i]){
                temposu++;
            }

            if (arr[i-1] < arr[i]){
                tempKemu++;
            }
        }

        if (temposu == 0){
            System.out.println("YES OSU");
        } else {
            System.out.println("NO OSU");
        }

        if (tempKemu == 0){
            System.out.println("YES Kemu");
        } else {
            System.out.println("NO Kemu");
        }
    }
}