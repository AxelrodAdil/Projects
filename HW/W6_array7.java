package PLaT;

import java.util.Arrays;
import java.util.Scanner;

public class W6_array7 {
    static Scanner sc = new Scanner(System.in);
/*
5
1
2
3
4
5
2
 */
    public static void moveRight(int[] array, int k) {
        System.out.println("Right");
        int[] result1 = new int[array.length];
        int kl = k;
        int tempIt = 0;
        for(int  i = 0; i < array.length; ++i) {
            if(k>0) {
                result1[i] = array[array.length-k];
                k--;
                tempIt++;
            } else {
                for (int j = 0; j < array.length-kl; j++) {
                    System.out.println(array[j]);
                    result1[tempIt] = array[j];
                    tempIt++;
                }
                System.out.println(Arrays.toString(result1));
                return;
            }
        }
    }

    public static void moveLeft(int[] array, int k) {
        int[] result2 = new int[array.length];
        int startFrom = 0;
        for(int  i = 0; i < array.length; ++i) {
            if(k + i < array.length) {
                result2[i] = array[k + i];
            } else {
                result2[i] = array[startFrom];
                ++startFrom;
            }
        }

        System.out.println("\nLeft");
        System.out.println(Arrays.toString(result2));
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arrA = new int[n];
        for (int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
            //arrA[i] = (int)(Math.random() * 1000);
        }
        int k = sc.nextInt();
        moveRight(arrA, k);
        moveLeft(arrA, k);
    }
}