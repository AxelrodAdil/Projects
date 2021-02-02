package Practice.Week_1;
import java.util.Scanner;
/*
Дан целочисленный массив размера N.
Преобразовать массив, увеличив каждую его серию на один элемент
(определение серии дано в задании Array116).
*/
public class AbrArr119 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int n = scanner.nextInt();
        int[] arr = new int[n * 2];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] != arr[i]) {
                n++;
                for (int j = n - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                i++;
            }
        }
        n++;
        arr[n - 1] = arr[n - 2];

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}