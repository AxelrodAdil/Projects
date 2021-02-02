import java.util.Scanner;

public class Array15 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int [] arr = new int[n+1];
        for (int i = 1; i <= n; i++){
            arr[i] = scanner.nextInt();
        }

        for (int i = 1; i <= n; i += 2){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = n-(n%2); i >= 1; i -= 2){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}