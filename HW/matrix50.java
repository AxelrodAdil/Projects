import java.util.Scanner;

public class matrix50 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arrayA = new int[n * 3][m * 3];
        for (int i = 0; i < m; i++) {
            for (int g = 0; g < n; g++) {
                arrayA[i][g] = scanner.nextInt();
            }
        }

        for (int j = 0; j < n; j++){
            int max = 1;
            int min = 1;
            for (int i = 1; i < m; i++){
                if (arrayA[i][j] > arrayA[max][j]){
                    max = i;
                }
                if (arrayA[i][j] < arrayA[min][j]){
                    min = i;
                }
            }
            arrayA[max][j] = arrayA[max][j] + arrayA[min][j];
            arrayA[min][j] = arrayA[max][j] - arrayA[min][j];
            arrayA[max][j] = arrayA[max][j] - arrayA[min][j];
        }

        for (int g = 0; g < m; g++) {
            for (int a = 0; a < n; a++) {
                System.out.print(arrayA[g][a] + " ");
            }
            System.out.println();
        }
    }
}