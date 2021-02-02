import java.util.Scanner;

public class matrix10 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arrayA = new int[n*3][m*3];
        for (int i = 0; i < n; i++) {
            for (int g = 0; g < m; g++) {
                arrayA[i][g] = scanner.nextInt();
            }
        }

        int j;
        for (int g = 0; g < n; g++){
            j = 0;
            while(j <= m){
                System.out.print(arrayA[g][j] + " ");
                j = j + 2;
            }
            System.out.println();
        }
    }
}