package Solutions;

import java.util.Scanner;

public class AbrMatrix1 {
    /*
    Даны целые положительные числа M и N.
    Сформировать целочисленную матрицу размера M × N,
    у которой все элементы I-й строки имеют значение 10*I (I = 1, …, M).
     */
    void solve(Scanner sc){
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] matrixA1 = new int [n+1][m+1];
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=m; j++){
                matrixA1 [i][j] = 10*i;
                System.out.printf(" %2d ",matrixA1[i][j]);
            }
            System.out.println();
        }
        System.out.println("----------");
        for(int a = 1; a<=n; a++){
            for(int b = 1; b<=m; b++){
                System.out.printf( "%2d ",matrixA1[a][b]);
            }
            System.out.println();
        }
    }

    void run(){
        try(Scanner sc = new Scanner(System.in)){
            solve(sc);
        }
    }

    public static void main (String [] args){
        new AbrMatrix1().run();
    }
}