package Solutions;

import java.util.Arrays;
import java.util.Scanner;

public class ACMP648 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            int k = sc.nextInt();
            arr[i] = k;
        }
        Arrays.sort(arr);
        int diff = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            diff -= arr[i];
        }
        for(int j = arr.length/2; j<arr.length; j++){
            diff += arr[j];
        }
        System.out.println(diff);
    }
}