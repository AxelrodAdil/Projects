package Practice.Week_1;

import java.util.Scanner;

/*
Дан целочисленный массив размера N.
Удалить из массива все элементы, встречающиеся более двух раз,
и вывести размер полученного массива и его содержимое.
*/
public class AbrArr99 {
    void solve (Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count >= 2) {
                int k = i - 1;
                int abc = arr[i];
                for (int j = i; j < n; j++) {
                    if (arr[j] != abc) {
                        k++;
                        arr[k] = arr[j];
                    }
                }
                n = k + 1;
                i--;
            }
        }

        System.out.println(n);                //size of array
        for (int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }

    void run() {
        try (Scanner sc = new Scanner(System.in)) {
            solve(sc);
        }
    }

    public static void main(String[] args) {
        new AbrArr99().run();
    }
}