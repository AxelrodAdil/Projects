package Practice;

import java.io.*;
import java.util.StringTokenizer;

/*
Дано множество A из N точек
(точки заданы своими координатами x, y).
Найти пару различных точек этого множества с максимальным
расстоянием между ними и само это расстояние
(точки выводятся в том же порядке,
в котором они перечислены при задании множества A).
*/
public class AbrArr134 {
/*
Мысалга бызге осындай есеп берылсын:
__А(3;-4)  В(-6;5)  C(-3;-3)  D(3;0)__
input: 4
3 -4
-6 5
-3 -3
3 0
output:
3 -4     --- x1=3; y1=-4;
-6 5     --- x2=-6; y2=5;
12.727922
*/
    void solve (){
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int[][] matrixArr = new int[n][2];
        for (int i = 0; i < n; i++) {
            matrixArr[i][0] = sc.nextInt();
            matrixArr[i][1] = sc.nextInt();
        }

        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrixArr[i][j] + " ");
            }
            System.out.println();
        }*/

        float maxDist = 0;
        float result = 0;
        int mark1 = 0;
        int mark2 = 0;

        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                //System.out.println("");
                result = (float) Math.sqrt(Math.pow(matrixArr[i][0] - matrixArr[j][0], 2) + Math.pow(matrixArr[i][1] - matrixArr[j][1], 2));

                //System.out.println("TestAlg " + result);
                if (result > maxDist){
                    //System.out.println("--new result-- " + result);
                    maxDist = result;
                    mark1 = i;
                    mark2 = j;
                }
            }
        }

        System.out.println(matrixArr[mark1][0]+" "+ matrixArr[mark1][1]);
        System.out.println(matrixArr[mark2][0]+" "+ matrixArr[mark2][1]);
        System.out.println(maxDist);
    }

    public static void main(String[] args) {
        new AbrArr134().solve();
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