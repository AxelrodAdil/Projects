package Coursera.AlgUCSanDiego.AlgToolbox;
//DONE
import java.io.*;
import java.util.*;

public class impQS {

    static void forPrint (int [] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    void InsertionSort (int [] arr){
        int minValue;
        for (int k = 0; k < arr.length; k++) {
            minValue = 0;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[minValue]) {
                    int t = arr[minValue];
                    arr[minValue] = arr[j];
                    arr[j] = t;
                }
                minValue = j;
            }
        }
        forPrint(arr);
    }

    //.....................

    static int [] partMain(int[] arr, int startId, int endId) {
        int May7 = startId;
        int May9 = endId;
        int i = startId;
        int x = arr[startId];
        int[] m = { May7, May9 };
        while (i <= May9) {
            if (arr[i] < x) {
                int temp = arr[May7];
                arr[May7] = arr[i];
                arr[i] = temp;
                May7++;
                i++;
            } else if (arr[i] == x) {
                i++;
            } else {
                int temp = arr[May9];
                arr[May9] = arr[i];
                arr[i] = temp;
                May9--;
            }
            m[0] = May7;
            m[1] = May9;
        }
        return m;
    }

    void QuickSort(int[] arr, int startId, int endId) {
        if (startId >= endId) {
            return;
        }
        int [] partM = partMain(arr, startId, endId);
        QuickSort(arr, startId, partM[0] - 1);
        QuickSort(arr, partM[1] + 1, endId);
    }

    void solve() {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (n<17){
            InsertionSort(arr);
        } else {
            QuickSort(arr, 0, n - 1);
            forPrint(arr);
        }
    }

    public static void main(String[] args) {
        new impQS().solve();
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