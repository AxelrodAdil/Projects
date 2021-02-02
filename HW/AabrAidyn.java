package Solutions;

import java.util.Scanner;

public class AabrAidyn {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] arr = new int [n][m];
        for (int i = 0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                int k = sc.nextInt();
                arr[i][j] = k;
            }
        }

        int count = 0;
        int count2 = 0;
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<m & arr[i][j] == 0; j++) {
                if (arr[i][j]!=0) {
                    count2 = 1;
                    System.out.println(" kk1");
                } else {
                    count2 = 0;
                    System.out.println(" kk0");
                }
            }
            count = count + count2;
            System.out.println(" --- ");
        }
        System.out.println(count);
    }
}