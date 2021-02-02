import java.util.Scanner;

public class Array60 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] arrayA = new int [n*5];
        int[] arrayB = new int [n*5];
        for (int i = 0; i < n; i++){
            arrayA[i] = scanner.nextInt();
        }

        for (int q = 0; q < n; q++){
            arrayB[q] = 0;
            for (int g = q; g < n; g++){
                arrayB[q] = arrayB[q] + arrayA[g];
            }
        }

        for (int i = 0; i < n; i++){
            System.out.println(arrayB[i]);
        }
    }
}