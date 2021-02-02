package PLaT;

import java.util.Scanner;

public class W6_array11 {

    static Scanner sc = new Scanner(System.in);
/*
3
2 5 1
2
 */
    public static void main(String[] args) {
        int n = sc.nextInt();
        double[] arrA = new double[n];
        for (int i = 0; i < n; i++) {
            // arrA[i] = (Math.random() * 1000);
            arrA[i] = sc.nextDouble();
        }
        System.out.print("X: ");
        int x = sc.nextInt();
        double Px = 0;
// 2 + 5*2 + 4
        for (int i = 0; i < n; i++){
            Px += arrA[i]*Math.pow(x, i);
        }

        System.out.println(Px);
    }
}