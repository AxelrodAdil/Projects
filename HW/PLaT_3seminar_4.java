package Adil_Sept;

import java.util.Arrays;
import java.util.Scanner;


public class PLaT_3seminar_4 {
    static Scanner sc = new Scanner(System.in);

    public static int removeDuplicateElements(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        // Changing original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        double sum = 0;
        int length = arr.length;
        length = removeDuplicateElements(arr, length);
        for (int i = 0; i < length; i++)
            sum += arr[i];
        System.out.println(sum);
    }
}