import java.util.Scanner;

public class matrix15 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[][] a = new int[n][n];
        for (int w = 0; w < n; w++) {
            for (int j = 0; j < n; j++) {
                a[w][j] = n * w + j + 1;
                System.out.printf("%2d ", a[w][j]);
            }
            System.out.println();
        }

        System.out.println("-------------");

        for (int i = n - 1, j = 0; i > 0; i--, j++) {
            for (int k = j; k < i; k++) System.out.print(a[j][k] + " ");
            for (int k = j; k < i; k++) System.out.print(a[k][i] + " ");
            for (int k = i; k > j; k--) System.out.print(a[i][k] + " ");
            for (int k = i; k > j; k--) System.out.print(a[k][j] + " ");
        }

        if (n % 2 == 1) {
            System.out.println(a[n / 2][n / 2]);
        }
    }
}