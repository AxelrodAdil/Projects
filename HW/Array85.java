import java.util.Scanner;

public class Array85 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        for (int j = 1; j <= k; j++){
            int r = arr[n-1];
            for (int t = n-1; t >= 1; t--){
                arr[t] = arr[t-1];
            }
            arr[0] = r;
        }

        for (int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
}