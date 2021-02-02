package Coursera.AlgUCSanDiego.AlgToolbox;

import java.io.*;
import java.util.*;

public class dot_product {
    static FastScanner sc = new FastScanner(System.in);
    /*
    private static long maximumAdvertisementRevenue(List<Long> firstList, List<Long> secondList) {
        firstList.sort(Long::compareTo);
        secondList.sort(Long::compareTo);
        long total = 0;
        for (int i = 0; i < firstList.size(); i++) {
            total += firstList.get(i) * secondList.get(i);
        }
        return total;
    }
    */

    private static long DotProduct(int[] arrA, int[] arrB) {
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        long result = 0;
        for (int i = 0; i < arrA.length; i++) {
            result += (long) arrA[i] * arrB[i];
        }
        return result;
    }

    void solve() throws IOException {
        int n = sc.nextInt();
        int[] arrA = new int[n];
        for (int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
        }
        int[] arrB = new int[n];
        for (int i = 0; i < n; i++) {
            arrB[i] = sc.nextInt();
        }
        System.out.println(DotProduct(arrA, arrB));



        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] FF1 = reader.readLine().split(" ");
        String[] FF2 = reader.readLine().split(" ");

        List<Long> firstList =
                Arrays.stream(FF1).map(Long::parseLong).collect(Collectors.toList());
        List<Long> secondList =
                Arrays.stream(FF2).map(Long::parseLong).collect(Collectors.toList());

        reader.close();

        System.out.println(maximumAdvertisementRevenue(firstList, secondList));*/
    }

    public static void main(String[] args) throws IOException {
        new dot_product().solve();
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