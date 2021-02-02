package HW;

import java.util.Scanner;
/*
    Дан массив А размера N и целое число K (1<=K<=N).
    Вывести элементы массива с порядковыми номерами, кратными К.
 */


public class Abr11 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("K: ");
        int k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            a[i] = t;
        }

        for (int j = 0; j*k<=n-1; j++) {
            System.out.println(a[j * k]+"    index array: "+j*k);
        }

        /*
        for (int j = k-1; j<n; j+=k) {
            System.out.println(a[j]);
        }
         */
    }
}