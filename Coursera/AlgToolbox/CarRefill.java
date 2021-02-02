package Coursera.AlgUCSanDiego.AlgToolbox;
//DONE
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CarRefill {

    static int FFF(int dist, int fuel, int[] arrRef) {
 
        int[] array = new int[arrRef.length + 1];
        for (int i = 0; i < arrRef.length; i++) array[i] = arrRef[i];
        array[arrRef.length] = dist;
        int curFuel = fuel;
        int count = 0;
        int prev = 0;

        for (int i = 0; i < array.length; i++) {
            int delta = array[i] - prev;
            int left = curFuel - delta;
            if (left < 0) {
                return -1;
            } else if (i < array.length - 1 && array[i + 1] - array[i] > left) {
                curFuel = fuel;
                count++;
            } else {
                curFuel = left;
            }
            prev = array[i];
        }
        return count;

        //*/
            /*
            if (arrRef[currR + 1] - arrRef[currR] > fuel) {
                return -1;
            }
            if (lastRefill + fuel < arrRef[currR + 1]) {
                lastRefill = arrRef[currR];
                HMrefills++;
            }
            currR++;
            */
    }


    void solve() {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        int fuelTank = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int j = 0; j < n; j++) {
            arr[j] = sc.nextInt();
        }
        System.out.println(FFF(distance, fuelTank, arr));
    }

    public static void main(String[] args) {
        new CarRefill().solve();
    }
}