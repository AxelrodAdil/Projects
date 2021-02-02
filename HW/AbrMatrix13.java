import java.util.Scanner;

/*

1    2    3    4
5    6    7    8
9    10   11   12
13   14   15   16

 */

public class AbrMatrix13 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = sc.nextInt();
                arr[i][j] = k;
            }
            System.out.println();
        }

        for (int l = 0; l < n; l++) {
            for (int i = 0; i < n-l; i++) {
                System.out.print(arr[l][i]+" ");
            }
            for (int j = l+1; j < n; j++) {
                System.out.print(arr[j][n-l-1] + " ");
            }
            System.out.println();
        }
    }
}