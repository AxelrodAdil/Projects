import java.util.Scanner;

public class matrix35 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();             //Строка
        int m = scanner.nextInt();             //Столбец
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        int i = 0;
        int temp = 0;
        for (i = 0; i < m; i++){
            temp = 0;
            for (int j = 0; j < n; j++){
                if (a[j][i]%2 == 0){
                    temp++;
                }
            }
            if (temp == 0){
                System.out.println(i+1);
                return;
            }
        }
        System.out.println(0);
    }
}