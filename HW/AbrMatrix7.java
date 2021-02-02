package Solutions;
import java.util.Scanner;

public class AbrMatrix7 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int d = sc.nextInt();
                arr[i][j] = d;
            }
            System.out.println();
        }

        for (int j = 0; j < n; j++) {
            System.out.print(arr[k-1][j]);
        }
    }
}