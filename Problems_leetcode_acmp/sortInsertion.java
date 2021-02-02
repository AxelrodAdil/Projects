package Algorithms.Sort;

import java.util.Scanner;

public class sortInsertion {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            //arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        System.out.println(" *-/ ");
        int minValue;
        for (int k = 0; k < arr.length; k++) {
            minValue = 0;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[minValue]) {
                    int t = arr[minValue];
                    arr[minValue] = arr[j];
                    arr[j] = t;
                }
                minValue = j;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}