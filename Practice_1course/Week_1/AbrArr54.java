package Practice.Week_1;

import java.util.Scanner;
/*
Дан целочисленный массив A размера N.
Переписать в новый целочисленный массив B
все четные числа из исходного массива
(в том же порядке) и вывести размер
полученного массива B и его содержимое.
*/

public class AbrArr54 {
    void solve (Scanner sc) {
        int count = 0;
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++){
            if (A[i]%2 == 0){
                B[count] = A[i];
                count++;
            }
        }

        System.out.println(count);
        for (int i = 0; i < count; i++){
            System.out.print(B[i] + " ");
        }
    }

    void run() {
        try (Scanner sc = new Scanner(System.in)) {
            solve(sc);
        }
    }

    public static void main(String[] args) {
        new AbrArr54().run();
    }
}