package Solutions;

import java.util.Scanner;

public class AbrMatrix22 {
    /*
    Дана матрица размера M × N.
    Для каждого столбца матрицы с четным номером (2, 4, …)
    найти сумму его элементов. Условный оператор не использовать.
     */
    void solve (Scanner sc){
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][] arr = new int[m][n];

        for (int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                arr[i][j] = n*i+j+1;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("---------");

        for(int i=0; i<m; i++){
            for(int j = 1; j<n; j+=2){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    void run(){
        try (Scanner sc = new Scanner(System.in)){
            solve(sc);
        }
    }

    public static void main(String[] args) {
        new AbrMatrix22().run();
    }
}