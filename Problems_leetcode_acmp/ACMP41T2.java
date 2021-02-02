package Solutions;

import java.util.Scanner;

public class ACMP41T2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            arr[i] = k;
        }
        boolean issorted = false;
        while(!issorted) {
            issorted = true;
            for (int r = 0; r < n; r++) {
                for (int j = 1; j < arr.length; j++) {
                    if (arr[j] < arr[j - 1]) {
                        int t = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = t;
                        issorted = false;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}