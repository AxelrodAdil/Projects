package Solutions;

import java.util.Scanner;

public class Abr9 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            arr[i] = k;
        }
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                count++;
                System.out.println("chetnye num: "+arr[i]+"      Skolko chetnyh num v array: "+count);
            }
        }
    }
}