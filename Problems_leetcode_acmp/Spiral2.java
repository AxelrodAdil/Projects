package Solutions;

import java.util.Scanner;
/*
 1  2  3
 4  5  6
 7  8  9
 */

public class Spiral2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        //int [][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        int columnBegin = 0;
        int columnEnd = matrix[0].length-1;

        while (rowBegin <= rowEnd && columnBegin <= columnEnd){
            for (int i=columnBegin; i<=columnEnd; i++){
                System.out.println(matrix[rowBegin][i]);
            }
            rowBegin++;

            for (int i=rowBegin; i<= rowEnd; i++){
                System.out.println(matrix[i][columnEnd]);
            }
            columnEnd--;

            if (rowBegin <= rowEnd){
                for (int i=columnEnd; i>=columnBegin; i--){
                    System.out.println(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            if (columnBegin<=columnEnd){
                for (int i=rowEnd; i>=rowBegin; i--){
                    System.out.println(matrix[i][columnBegin]);
                }
            }
            columnBegin++;
        }
    }
}