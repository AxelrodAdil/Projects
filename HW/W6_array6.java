package PLaT;

import java.util.Scanner;
/*
7
1 2 3 4 5 6 7
5
9
 */
public class W6_array6 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arrA = new int[n];
        for (int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
            //arrA[i] = (int)(Math.random() * 1000);
        }
        System.out.print("C: ");
        int C = sc.nextInt();

        System.out.print("D: ");
        int D = sc.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (C<=arrA[i] && arrA[i]<=D){
                count++;
            }
        }

        System.out.println(count);
    }
}