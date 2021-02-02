package PLaT;

import java.util.Scanner;
import java.util.Stack;

public class W7_specialForMe {
    public static void antiSpiralTraversal(int m, int n, int a[][]) {
        int i, k = 0, l = 0;

        /*  k - starting row index
            m - ending row index
            l - starting column index
            n - ending column index
            i - iterator  */

        Stack<Integer> stk = new Stack<Integer>();

        while (k <= m && l <= n) {
            for (i = l; i <= n; ++i)
                stk.push(a[k][i]);
            k++;

            for (i = k; i <= m; ++i)
                stk.push(a[i][n]);
            n--;

            if (k <= m) {
                for (i = n; i >= l; --i)
                    stk.push(a[m][i]);
                m--;
            }

            if (l <= n) {
                for (i = m; i >= k; --i)
                    stk.push(a[i][l]);
                l++;
            }
        }

        while (!stk.empty()) {
            System.out.print(stk.peek() + " ");
            stk.pop();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int matrix[][] = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = (int)(Math.random()*100);
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }

        antiSpiralTraversal(matrix.length - 1, matrix[0].length - 1, matrix);
    }
}