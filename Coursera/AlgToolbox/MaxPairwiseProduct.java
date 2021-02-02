package Coursera.AlgUCSanDiego.AlgToolbox;
//DONE
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class MaxPairwiseProduct {

    static BigInteger getMaxPairwiseProduct(int preMax, int MaxMax) {

        BigInteger pressF1 = BigInteger.valueOf(preMax);
        BigInteger pressF2 = BigInteger.valueOf(MaxMax);
        BigInteger result = pressF1.multiply(pressF2);
        return result;
    }

    void solve(Scanner sc) {
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int preMax = arr[arr.length - 2];
        int MaxMax = arr[arr.length - 1];

        System.out.println(getMaxPairwiseProduct(preMax, MaxMax));
    }

    void run() {
        try (Scanner sc = new Scanner(System.in)) {
            solve(sc);
        }
    }

    public static void main(String[] args) {
        new MaxPairwiseProduct().run();
    }
}