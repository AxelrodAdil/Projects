import java.util.Scanner;

public class matrix20 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arrayA = new int[n*3][m*3];
        for (int i = 0; i < m; i++) {
            for (int g = 0; g < n; g++) {
                arrayA[i][g] = scanner.nextInt();
            }
        }

        int temp = 1;
        for (int g = 0; g < n; g++){
            temp = 1;
            for (int a = 0; a < m; a++){
                temp = temp * arrayA[a][g];
            }
            System.out.println(temp);
        }
    }
}