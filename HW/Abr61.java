package Solutions;

import java.util.Scanner;

public class Abr61 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] b = new int[n];
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            a[i] = t;
        }

        for (int k = 0; k < n; k++) {
            b[k] = 0;
            for (int j = k; j < n; ++j) {
                b[k] += a[j];
            }
            b[k] /= (n - k);
        }
        for (int k = 0; k < n; ++k){
            System.out.println(b[k]);
        }
    }
}