import java.util.Scanner;

public class Array90 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arrayA = new int [n*5];
        for (int i = 0; i < n; i++){
            arrayA[i] = scanner.nextInt();
        }
        n--;
        for (int i = k-1; i < n; i++){
            arrayA[i] = arrayA[i+1];
        }

        for (int q = 0; q < n; q++){
            System.out.println(arrayA[q]);
        }
    }
}