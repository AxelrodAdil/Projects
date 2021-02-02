package Coursera.AlgUCSanDiego.AlgToolbox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Covering_segments {
    public static int[] optimalPoints(Segment[] segments) {
        LinkedList<Integer> points = new LinkedList<Integer>();
        Arrays.sort(segments, (Segment a, Segment b) -> a.start - b.start);
        Segment curr = null;
        for (Segment seg : segments) {
            Segment newCurr = Segment.segMerge(curr, seg);
            if (!newCurr.isValidSegment()) {
                points.add(curr.end);
                newCurr = seg;
            }
            curr = newCurr;
        }
        points.add(curr.end);
        return points.stream().mapToInt(q -> q).toArray();
    }

    public static class Segment {
        public int start, end;

        public static Segment segMerge(Segment seg1, Segment seg2) {
            return new Segment(
                    seg1 == null ? seg2.start : Math.max(seg1.start, seg2.start),
                    seg1 == null ? seg2.end : Math.min(seg1.end, seg2.end)
            );
        }

        public boolean isSinglePoint() {
            return start - end == 0;
        }

        public boolean isValidSegment() {
            return end - start >= 0;
        }

        Segment(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public String toString() {
            return "{ " + this.start + ", " + this.end + " }";
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        Segment[] segments = new Segment[n];
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            segments[i] = new Segment(start, end);
        }
        int[] points = optimalPoints(segments);
        System.out.println(points.length);
        for (int point : points) {
            System.out.print(point + " ");
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