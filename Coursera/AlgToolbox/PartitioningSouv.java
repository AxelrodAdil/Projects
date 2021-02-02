package Coursera.AlgUCSanDiego.AlgToolbox;

import java.io.*;
import java.util.*;

public class PartitioningSouv {
    static FastScanner sc = new FastScanner(System.in);

    private static boolean partition3(int[] gifts, int a, int b, int partition, int Id) {
        if (a == b && a == partition) return true;
        if (a > partition || b > partition || Id >= gifts.length) return false;
        int giftValue = gifts[Id];
        return partition3(gifts, a + giftValue, b, partition, Id + 1) ||
                partition3(gifts, a, b + giftValue, partition, Id + 1) ||
                partition3(gifts, a, b, partition, Id + 1);
    }

    public static int partition3(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        if (sum % 3 != 0) return 0;
        return partition3(arr, arr[0], 0, sum / 3, 1) ? 1 : 0;
    }

    void solve() {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(partition3(arr));
    }

    public static void main(String[] args) {
        new PartitioningSouv().solve();
    }

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