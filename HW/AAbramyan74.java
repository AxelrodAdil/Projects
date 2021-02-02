package Solutions;

import java.util.Scanner;

/* Дан массив размера N. Обнулить элементы массива,
расположенные между его минимальным и максимальным элементами
(не включая минимальный и максимальный элементы).
 */

public class AAbramyan74 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int [] a = new int [n];
        for (int i=0; i<n; i++){
            int k = sc.nextInt();
            a[i]=k;
        }
        int max = 0;
        int min = 0;
        int qwe;
        for (int i=n-1; i>=0; i--){
            if(a[i]>a[max]) max=i;
            if(a[i]<a[min]) min=i;
        }
        if (max<min){
            qwe = max;
            max = min;
            min = qwe;
        }
        for (int i=min+1; i<max; i++){
            a[i]=0;
        }
        for (int i=0; i<n; i++){
            System.out.println(i+": "+a[i]);
        }
        System.out.println();
    }
}