package Adil_Sept;

import java.util.Scanner;

public class PLaT_3seminar_6 {
    static Scanner sc = new Scanner(System.in);
/*
7
0 2 4 6 3 -1 1
3
4 6 3
*/
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] y = new int[m];
        for (int i = 0; i < m; i++) {
            y[i] = sc.nextInt();
        }

        int i = 0;
        int j = 0;
        for (j = 0; j < m; j++) {
            i = 0;
            while (i < n && x[i] != y[j]) {
                i++;
            }
            System.out.println("here ");
            if (i == n)
                break;
        }

        if (j == m)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
