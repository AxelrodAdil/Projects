package Coursera.AlgUCSanDiego.AlgToolbox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class pointsAndSegments {
    private static int count;
    private static Element[] all;
    private static int number;


    private static int[] fastCountSegments(Element[] a, int points) {
        int[] cnt = new int[points];
        Arrays.sort(a, new Comparator<Element>(){
            @Override
            public int compare(Element o1, Element o2) {
                return (int) (o1.value == o2.value ? o1.label - o2.label : o1.value-o2.value);
            }});
        for (int i = 0; i < a.length; i++) {
            if(a[i].label == 'l'){
                ++count;
            } else if(a[i].label == 'r'){
                --count;
            }
            if(a[i].label == 'p'){

                cnt[a[i].id] = count;
            }
        }
        return cnt;
    }

    static class Element{
        long value;
        char label;
        int id;
        Element(int id, char label, long value){
            this.label = label;
            this.value = value;
            this.id = id;
        }
        Element(Element a){
            this.label = a.label;
            this.value = a.value;
            this.id = a.id;
        }
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        number = m+2*n;
        all = new Element[number];
        for (int i = 0; i < n; i++) {
            all[2*i] = new Element(i, 'l', scanner.nextInt());
            all[2*i+1] = new Element(i, 'r', scanner.nextInt());
        }

        for (int i = 0; i < m; i++) {
            all[2*n+i] = new Element(i, 'p', scanner.nextInt());
        }
        int[] cnt = fastCountSegments(all, m);
        for (int x : cnt) {
            System.out.print(x + " ");
        }
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