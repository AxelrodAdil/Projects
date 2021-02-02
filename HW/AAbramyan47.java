package Solutions;

import java.util.Scanner;

// Дан целочисленный массив размера N.
// Найти количество различных элементов в данном массиве.

public class AAbramyan47 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int []a = new int[n];
        for (int i=0; i<n; i++){
            int k = sc.nextInt();
            a[i] = k;
        }
        int count = 1;
        for (int i=1; i<n; i++, count++){
            for (int j=i-1; j>=0; j--){
                if (a[i]==a[j]){
                    count--;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}