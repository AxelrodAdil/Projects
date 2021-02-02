import java.util.Scanner;

public class Array120 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] arrayA = new int[n * 5];
        for (int i = 0; i < n; i++) {
            arrayA[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++){
            if (i+1 < n){
                if (arrayA[i] != arrayA[i+1]){
                    n--;
                    for (int j = i; j < n; j++){
                        arrayA[j] = arrayA[j+1];
                    }
                    i--;
                }
            }
        }
        n--;
        for (int k = 0; k < n; k++){
            System.out.println(arrayA[k]);
        }
    }
}