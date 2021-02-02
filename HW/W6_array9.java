package PLaT;

import java.util.Arrays;
import java.util.Scanner;

public class W6_array9 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }

        int temp = 0;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0){
                result[temp] = arr[i];
                temp++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0){
                result[temp] = arr[i];
                temp++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}