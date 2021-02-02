import java.util.Scanner;

public class matrix80 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int m = scanner.nextInt();
        int[][] arrayA = new int[m * 3][m * 3];
        for (int i = 0; i < m; i++) {
            for (int g = 0; g < m; g++) {
                arrayA[i][g] = scanner.nextInt();
            }
        }

        int sum = 0;
        for (int q = 0; q < m; q++){
            for (int g = 0; g < m; g++){
                if (q == g){
                    sum = sum + arrayA[q][g];
                }
            }
        }
        System.out.println(sum);
    }
}