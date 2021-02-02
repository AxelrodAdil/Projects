package PLaT;

import java.util.Scanner;

public class W6_array4 {
    static Scanner sc = new Scanner(System.in);
/*
3
2 5
0 8
8 2
 */
    public static void main(String[] args) {
        int n = sc.nextInt();
        double[] arrA = new double[n];
        double[] arrB = new double[n];
        for (int i = 0; i < n; i++) {
            /*arrA[i] = (Math.random() * 1000);
            arrB[i] = (Math.random() * 1000);*/

            arrA[i] = sc.nextDouble();
            arrB[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++){
            double temp = arrB[i] - arrA[i];
            System.out.println("A[" + i + "] жане B[" + i + "] элементтердын узындыктарынын айырымы: " + Math.abs(temp));
        }

        //  max-min = length
        double maxA = Integer.MIN_VALUE;
        double minA = Integer.MAX_VALUE;
        double maxB = Integer.MIN_VALUE;
        double minB = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arrA[i] > maxA) { maxA = arrA[i]; }
            if (arrA[i] < minA) { minA = arrA[i]; }

            if (arrB[i] > maxB) { maxB = arrB[i]; }
            if (arrB[i] < minB) { minB = arrB[i]; }
        }

        double lengthA = maxA-minA;
        double lengthB = maxB-minB;
        System.out.println("\nУзындыктарынын айырымы: " + Math.abs(lengthA-lengthB));
    }
}