package HW;

import java.util.*;

public class AbrMatrix15 {
    /*
    Дана квадратная матрица A порядка M (M — нечетное число).
    Начиная с элемента A1,1 и перемещаясь по часовой стрелке,
    вывести все ее элементы по спирали: первая строка, последний столбец,
    последняя строка в обратном порядке, первый столбец в обратном порядке,
    оставшиеся элементы второй строки и т. д.;
    последним выводится центральный элемент матрицы.
     */
    void solve (Scanner sc){
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for(int w = 0; w<n; w++){
            for(int j = 0; j<n; j++){
                a[w][j] = n * w + j + 1;
                System.out.printf("%2d ", a[w][j]);
            }
            System.out.println();
        }

        System.out.println("-------------");

        for (int i = n-1, j = 0; i > 0; i--, j++) {
            for (int k = j; k < i; k++) System.out.print(a[j][k]+" ");
            for (int k = j; k < i; k++) System.out.print(a[k][i]+" ");
            for (int k = i; k > j; k--) System.out.print(a[i][k]+" ");
            for (int k = i; k > j; k--) System.out.print(a[k][j]+" ");
        }

        if(n%2==1){
            System.out.println(a[n/2][n/2]);
        }
    }

    void run (){
        try (Scanner sc = new Scanner(System.in)){
            solve(sc);
        }
    }

    public static void main(String[] args) {
        new AbrMatrix15().run();
    }
}