package Coursera.AlgUCSanDiego.AlgToolbox;

import java.io.*;
import java.util.*;

public class KnapsDynamic {
    static FastScanner sc = new FastScanner(System.in);

    static int optimalWeight(int w, int[] wArr) {
        int count = 0;
        for (int a : wArr) {
            if (a <= w)
                count++;
        }
        int[] items = new int[count];
        int id = 0;
        for (int i = 0; i < wArr.length - 1; i++) {
            if (wArr[i] <= w) {
                items[id] = wArr[i];
                id++;
            }
        }

        int capacity = w + 1;
        int K[][] = new int[items.length + 1][capacity];
        for (int col = 0; col <= w; col++) {
            K[0][col] = 0;
        }
        for (int row = 0; row <= items.length; row++) {
            K[row][0] = 0;
        }

        for (int i = 1; i <= items.length; i++) {
            for (int j = 1; j <= w; j++) {
                if (items[i - 1] <= j) {
                    K[i][j] =
                            Math.max(items[i - 1] + K[i - 1][j - items[i - 1]],
                            K[i - 1][j]);
                } else {
                    K[i][j] = K[i - 1][j];
                }
            }
        }
        return K[items.length + 1][capacity];
    }

    void solve (){
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[] wArr = new int[n];
        for (int i = 0; i < n; i++) {
            wArr[i] = sc.nextInt();
        }
        System.out.println(optimalWeight(w, wArr));

    }

    public static void main(String[] args) {
        new KnapsDynamic().solve();
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner (InputStream stream){
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e){
                e.printStackTrace();
            }
        }

        String next(){
            while (st == null || !st.hasMoreTokens()){
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt(){
            return Integer.parseInt(next());
        }
    }
}