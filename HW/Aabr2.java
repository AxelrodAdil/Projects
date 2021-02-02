package Solutions;

import java.util.Scanner;

public class Aabr2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int [] a = new int [n];
        for (int i=0; i<n; i++){
            int k = sc.nextInt();
            a[i] = k;
        }
        int [] c = new int [n];
        for (int i=0, j=n-1; i<n; i++, j--){
            c[i] = a[i];
            a[i] = a[j];
            a[j] = c[i];
            System.out.println(a[i]+" "+ a[j]);
        }
    }
}
