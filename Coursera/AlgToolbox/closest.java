package Coursera.AlgUCSanDiego.AlgToolbox;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class closest {

    static void minimalDistance(Point[] arrA, Point arrB[]) {
        Arrays.sort(arrA, new Comparator<Point>() {
            public int compare(Point b1, Point b2) {
                if (b1.x > b2.x)
                    return 1;
                return -1;
            } } );

        Arrays.sort(arrB, new Comparator<Point>() {
            public int compare(Point b1, Point b2) {
                if (b1.x > b2.x)
                    return 1;
                return -1;
            } } );

        double uraF = Double.POSITIVE_INFINITY;
        System.out.println(recursionFunction(arrA, arrB, 0, arrA.length - 1, uraF));
    }

    static double recursionFunction(Point[] arrA, Point arrB[], int left, int right, double uraF1) {
        if (right - left <= 3) {
            for (int i = left; i <= right; i++) {
                for (int j = i + 1; j <= right; j++) {
                    int abc = (arrA[i].x - arrA[j].x) * (arrA[i].x - arrA[j].x);
                    int xyz = (arrA[i].y - arrA[j].y) * (arrA[i].y - arrA[j].y);
                    double m = Math.pow(abc + xyz, 0.5);
                    if (m < uraF1) {
                        uraF1 = m;
                    }
                }
            }
            return uraF1;
        }

        int mid = (left + right) / 2;
        Point[] temp1 = new Point[right + 1];
        Point[] temp2 = new Point[(right + 1)];
        sort(arrB, temp1, left, mid);
        sort(arrB, temp2, mid + 1, right);
        int FFF = arrA[mid].x;

        for (int d = mid + 1; arrA[d].x == FFF; d++) {
            mid++;
        }
        double uraF2 = recursionFunction(arrA, arrB, left, mid, uraF1);
        double uraF3 = recursionFunction(arrA, arrB, mid + 1, right, uraF1);
        double uraFFromRecursion;

        if (uraF2 < uraF3) {
            uraFFromRecursion = uraF2;
            uraF1 = uraF2;
        } else {
            uraFFromRecursion = uraF3;
            uraF1 = uraF3;
        }
        ArrayList<Point> arr = new ArrayList();

        for (int k = left; k <= right; k++) {
            if (arrB[k].x >= (arrA[mid].x - uraFFromRecursion) && arrB[k].x <= arrA[mid].x + uraFFromRecursion) {
                arr.add(arrB[k]);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size() && j < 8; j++) {
                int a1 = (arr.get(i).x - arr.get(j).x) * (arr.get(i).x - arr.get(j).x);
                int a2 = (arr.get(i).y - arr.get(j).y) * (arr.get(i).y - arr.get(j).y);
                double m = Math.pow(a1 + a2, 0.5);
                if (m < uraFFromRecursion) {
                    uraFFromRecursion = m;
                    uraF1 = m;
                }
            }
        }
        return uraF1;
    }


    private static long sort(Point[] arrA, Point[] arrB, int left, int right) {
        long numOfInversions = 0;
        if (right <= left + 1) {
            if (right - left > 0) {
                if (arrA[left].y > arrA[right].y) {
                    numOfInversions++;
                    Point temp = arrA[left];
                    arrA[left] = arrA[right];
                    arrA[right] = temp;
                }
            }
            return numOfInversions;
        }

        int centre = (left + right) / 2;
        numOfInversions += sort(arrA, arrB, left, centre);
        numOfInversions += sort(arrA, arrB, centre + 1, right);
        int pressFCoursera = left;
        int mid = centre + 1;
        for (int i = left; i <= right; i++) {
            if (centre >= right) {
                for (int j = i; j <= right; j++) {
                    arrB[j] = arrA[pressFCoursera];
                    pressFCoursera++;
                }
                break;
            }
            if (pressFCoursera >= mid) {
                for (int z = i; z <= right; z++) {
                    arrB[z] = arrA[i];
                    i++;
                }
                break;
            }
            if (arrA[pressFCoursera].y > arrA[centre + 1].y) {
                numOfInversions += centre + 1 - i;
                arrB[i] = arrA[centre + 1];
                centre++;
            } else {
                arrB[i] = arrA[pressFCoursera];
                pressFCoursera++;
            }
        }

        for (int x = left; x <= right; x++) {
            arrA[x] = arrB[x];
        }
        return numOfInversions;
    }

    public static void main(String[] args) {
        reader = new BufferedReader(new InputStreamReader(System.in));
        writer = new PrintWriter(System.out);
        int n = nextInt();
        Point[] arrA = new Point[n];
        Point[] arrB = new Point[n];
        for (int i = 0; i < n; i++) {
            int v = nextInt();
            int c = nextInt();
            arrA[i] = new Point(v, c);
            arrB[i] = new Point(v, c);
        }
        minimalDistance(arrA, arrB);
        writer.close();
    }

    static BufferedReader reader;
    static PrintWriter writer;
    static StringTokenizer tok = new StringTokenizer("");

    static String next() {
        while (!tok.hasMoreTokens()) {
            String w = null;
            try {
                w = reader.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (w == null)
                return null;
            tok = new StringTokenizer(w);
        }
        return tok.nextToken();
    }

    static int nextInt() {
        return Integer.parseInt(next());
    }

    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}