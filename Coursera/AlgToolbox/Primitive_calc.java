package Coursera.AlgUCSanDiego.AlgToolbox;

import java.io.*;
import java.util.*;

public class Primitive_calc {

    static List<Integer> sequence(int n) {
        int[] a = new int[n + 1];
        int[] pressF = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            a[i] = a[i - 1] + 1;
            pressF[i] = i - 1;
            if (i % 3 == 0) {
                if (a[i / 3] < a[i]) {
                    a[i] = a[i / 3] + 1;
                    pressF[i] = i / 3;
                }
            }
            if (i % 2 == 0) {
                if (a[i / 2] < a[i]) {
                    a[i] = a[i / 2] + 1;
                    pressF[i] = i / 2;
                }
            }
        }

        ArrayList<Integer> sequence = new ArrayList<Integer>();
        for (int i = n; i != 0; i = pressF[i]) {
            sequence.add(i);
        }
        Collections.reverse(sequence);
        return sequence;
    }

    void solve (){
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        List<Integer> sequence = sequence(n);
        System.out.println(sequence.size() - 1);
        for (Integer x : sequence) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new Primitive_calc().solve();
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