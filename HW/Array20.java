import java.util.Scanner;

public class Array20 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int[] array = new int [l+1];
        for (int i = 1; i <= l; i++){
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int q = k; q <= l; q++){
            sum = sum + array[q];
        }

        System.out.println(sum);
    }
}