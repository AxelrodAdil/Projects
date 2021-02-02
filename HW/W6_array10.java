package PLaT;

import java.util.Arrays;
import java.util.Scanner;

public class W6_array10 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arrA = new int[n];
        for (int i = 0; i < n; i++) {
            arrA[i] = (int) (Math.random() * 1000);
        }

        int[] arrB = new int[n];
        for (int i = 0; i < n; i++) {
            arrB[i] = (int) (Math.random() * 1000);
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = arrA[i] - arrB[i];
        }
        Arrays.sort(result);
        for (int i = n-1; i >= 0; i--){
            System.out.println(result[i]);
        }

        System.out.println(Arrays.toString(result));
    }
}