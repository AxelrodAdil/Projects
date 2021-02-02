package Algorithms.Sort;

import java.util.Scanner;
/*
Bubble Sort       Пузырьковая сортировка    O(n^2);        O(n);
Insertion Sort    Сортировка вставки        O(n^2);        O(n);
Selection Sort    Выбор сортировки          O(n^2);        O(n);
Merge Sort        Сортировка слиянием       O(n*log(n));   O();
Heapsort          Пирамидальная сортировка  O(n*log(n));   O();
Quicksort         Quicksort                 O(n^2);        O(n*log(n));
Sorting in Java   Сортировка в Java         O();
*/
public class SortBubble {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = n-1; i >= 0; i--) {
            arr[i] = (int)(Math.random()*100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int k = 0; k < n; k++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = t;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}