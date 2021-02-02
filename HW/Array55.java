import java.util.Scanner;

public class Array55 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n; i += 2){
            count++;
            System.out.println(arr[i]);
        }
        System.out.println(count);
    }
}