import java.util.Scanner;

public class Array10 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int k = 0; k < n; k++){
            array[k] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++){
            if (array[i]%2 == 0){
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        for (int i = n-1; i >= 0; i--){
            if (array[i]%2 == 1){
                System.out.print(array[i] + " ");
            }
        }

        System.out.println();
    }
}