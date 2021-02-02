package Adil_Sept;

import java.util.Scanner;

public class PLaT_3seminar_3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        double sumJup = 0;
        double sumTak = 0;
        for (int i = 0; i < n; i++) {
            if (i%2==0) {
                sumJup += arr[i];
            } else {
                sumTak += arr[i];
            }
        }

        double c = sumTak * sumJup;  // кобейтындысы
        System.out.println(c);
    }
}
