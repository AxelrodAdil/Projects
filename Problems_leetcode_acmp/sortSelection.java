package Algorithms.Sort;

import java.io.PrintWriter;
import java.util.Scanner;

public class sortSelection {
    //5   5 4 1 3 9
    void solve(Scanner sc, PrintWriter out) {
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++){
            int min = arr[i];
            int minId = i;
            for (int j = i+1; j < arr.length; j++){
                if (min>arr[j]){
                    min = arr[j];
                    minId = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[minId] = temp;
        }

        for (int k = 0; k<arr.length; k++){
            System.out.print(arr[k]+" ");
        }
    }

    void run() {
        try (Scanner sc = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new sortSelection().run();
    }
}