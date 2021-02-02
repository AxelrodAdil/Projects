import java.util.Scanner;

public class matrix55 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();             //Строка%2==0
        int m = scanner.nextInt();             //Столбец
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        int rowColumn = 1;
        for (int i = 0; i < a[rowColumn].length; i++) {
            int temp = a[rowColumn][i];
            a[rowColumn][i] = a[0][i];
            a[0][i] = temp;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}