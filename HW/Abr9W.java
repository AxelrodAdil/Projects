package Solutions;

import java.util.Scanner;

public class Abr9W {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int [][]arr = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                arr[i][j] = n*i+j+1;
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("--------");
        System.out.print(arr[0][0]+" ");
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<n-1; j++){
                if(i==j){
                    System.out.print(arr[i+1][j+1]+" ");
                }
            }
        }
    }
}