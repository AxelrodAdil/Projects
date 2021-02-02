import java.util.Scanner;

public class Array125 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int l = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arrA = new int[n*2];
        int[] arrB = new int[n*2];
        for (int i = 0; i < n; i++) {
            arrA[i] = scanner.nextInt();
        }

        int k = 0;
        int length = 1;
        int arrLength = n;
        int i;

        for (i = 1; i < n; ++i) {
            if (arrA[i - 1] != arrA[i]) {
                if (length < l) {
                    arrB[k++] = 0;
                    arrLength -= length - 1;
                } else {
                    for (int j = 0; j < length; ++j) {
                        arrB[k++] = arrA[i - 1];
                    }
                }
                length = 0;
            }
            length++;
        }

        if (length < l) {
            arrB[k++] = 0;
            arrLength -= length - 1;
        } else {
            for (int j = 1; j <= length; j++) {
                arrB[k++] = arrA[i - 1];
            }
        }

        for (i = 0; i < arrLength; i++) {
            arrA[i] = arrB[i];
        }

        for (i = 0; i < arrLength; i++) {
            System.out.print(arrA[i] + " ");
        }
    }
}