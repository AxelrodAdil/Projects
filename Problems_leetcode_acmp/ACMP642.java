package Solutions;

import java.util.Arrays;
import java.util.Scanner;

public class ACMP642 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[sc.nextInt()];
        int s = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            int k = sc.nextInt();
            arr[i] = k;
        }
        Arrays.sort(arr);
        int summa = 0;
        int maxCar = 0;
        for (int i = 0; i < arr.length; i++) {
            summa += arr[i];
            if(summa>s){
                break;
            }
            maxCar++;
        }
        System.out.println(maxCar);
    }
}