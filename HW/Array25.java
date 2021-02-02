import java.util.Scanner;

public class Array25 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        float q = (float) arr[1] / (float) arr[0];
        for (int i = 1; i < n; i++){
            if (q != (float) arr[i] / (float) arr[i-1]){
                q = 0;
            }
        }

        System.out.println(q);
    }
}