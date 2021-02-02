package Coursera.AlgUCSanDiego.AlgToolbox;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.stream.Collectors;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
//import java.util.StringTokenizer;
//import java.io.InputStream;


public class BinarySearch {

    private static int findIndex(List<Integer> searchList, int num) {
        int temp = 0;
        int pressF = searchList.size() - 1;

        while (temp <= pressF) {
            int index = (pressF + temp) / 2;
            int mid = searchList.get(index);
            if (mid == num) {
                return index;
            } else if (mid > num) {
                pressF = index - 1;
            } else {
                temp = index + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> searchList = Arrays.stream(reader.readLine().split(" ")).skip(1).
                map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> findList = Arrays.stream(reader.readLine().split(" ")).skip(1).
                map(Integer::parseInt).collect(Collectors.toList());
        reader.close();

        List<Integer> index = findList.stream().map(integer -> findIndex(searchList, integer)).
                collect(Collectors.toList());

        for (Integer e : index) {
            System.out.print(e + " ");
        }
    }

    /*static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }*/

    /*static int binarySearch(int[] arr, int x) {
        int lower = 0;
        int higher = arr.length;
        while (lower < higher) {
            int index = (lower + higher) / 2;
            int centre = arr[index];
            if (centre == x) {
                return index;
            } else if (centre < x) {
                lower = index + 1;
            } else if (centre > x) {
                higher = index;
            }
        }
        return -1;
    }*/

    /*void solve (){
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int [] arrN = new int [n];
        for (int i = 0; i < n; i++){
            arrN [i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int [] arrM = new int[m];
        for (int i = 0; i < n; i++){
            arrM[i] = sc.nextInt();
        }

        String temp = "";
        for (int i = 0; i < m; i++) {
            temp += binarySearch(arrN, arrM[i]) + " ";
        }
        System.out.print(temp);
    }

    public static void main(String[] args) {
        new BinarySearch().solve();
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
    }*/

}