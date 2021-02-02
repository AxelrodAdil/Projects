import java.util.Scanner;

public class AbrMatrix9 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int d = sc.nextInt();
                arr[i][j] = d;
            }
        }

        for (int j = 2; j < n; j += 2) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[j][i]+" ");
            }
        }
    }
}