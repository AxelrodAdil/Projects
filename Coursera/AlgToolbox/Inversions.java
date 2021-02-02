package Coursera.AlgUCSanDiego.AlgToolbox;
//DONE
import java.io.*;
import java.util.*;

public class Inversions {

    static long mergeSort(int[] arrA, int[] arrB, int left, int ave, int right) {
        int i = left;
        int k = left;
        int j = ave;
        long numberOfInversions = 0;

        while (i <= ave - 1 && j <= right) {
            if (arrA[i] <= arrA[j]) {
                arrB[k] = arrA[i];
                i++;
            } else {
                arrB[k] = arrA[j];
                numberOfInversions += ave - i;
                j++;
            }
            k++;
        }
        while (i <= ave - 1) {
            arrB[k] = arrA[i];
            i++;
            k++;
        }
        while (j <= right) {
            arrB[k] = arrA[j];
            j++;
            k++;
        }

        for (i = left; i <= right; i++) {
            arrA[i] = arrB[i];
        }
        return numberOfInversions;
    }

    private static long getNumberOfInversions(int[] arrA, int[] arrB, int left, int right) {
        long numberOfInversions = 0;
        if (right <= left) {
            return numberOfInversions;
        }
        int ave = left + (right - left) / 2;
        numberOfInversions += getNumberOfInversions(arrA, arrB, left, ave);
        numberOfInversions += getNumberOfInversions(arrA, arrB, ave + 1, right);
        numberOfInversions += mergeSort(arrA, arrB, left, ave + 1, right);
        return numberOfInversions;
    }

    void solve (){
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int[] arrA = new int[n];
        for (int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
        }
        int[] arrB = new int[n];
        System.out.println(getNumberOfInversions(arrA, arrB, 0, arrA.length - 1));
    }

    public static void main(String[] args) {
        new Inversions().solve();
    }

    //......................

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}