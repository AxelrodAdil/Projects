package Solutions;

import java.util.Scanner;

public class AbrMatrix10 {
    /*
    Дана матрица размера M × N. Вывести ее элементы,
    расположенные в столбцах с нечетными номерами (1, 3, …).
    Вывод элементов производить по столбцам, условный оператор не использовать.
     */
    void solve (Scanner sc){
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][] array = new int [m][n];
        for(int i = 0; i<m; i++) {
            for (int j = 0; j < n; j ++) {
                array[i][j] = n*i+j+1;
                System.out.printf("%2d ", array [i][j]);
            }
            System.out.println();
        }

        System.out.println("---------");

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j+=2){
                System.out.printf("%2d ", array [i][j]);
            }
            System.out.println();
        }
    }

    void run (){
        try(Scanner sc = new Scanner(System.in);){
            solve(sc);
        }
    }

    public static void main(String[] args) {
        new AbrMatrix10().run();
    }
}