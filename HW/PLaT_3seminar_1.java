package Adil_Sept;

import java.util.Scanner;

//PLaT_3seminar_1
public class PLaT_3seminar_1 {
    static Scanner sc = new Scanner(System.in);

    public static boolean checkSimple(int i){
        if (i<=1)
            return false;
        else if (i <=3)  //2, 3
            return true;
        else if (i%2==0 || i %3 ==0)
            return false;
        int n = 5;
        while (n*n <=i){  // 25-тен улкен сандар
            if (i % n ==0 || i % (n+2) == 0)
                return false;
            n=n+6;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(arr[0] + " ");
        for (int i=1; i<n; i++) {
            if (checkSimple(arr[i - 1]) && checkSimple(arr[i])) {  //массивтегы сандар жай сан екендыгын тексеру
                if (arr[i - 1] < arr[i]) {   // массивтегы алдындагы сан улкен болса оспелы
                    System.out.print(arr[i] + " ");
                } else {
                    System.out.println("Оспелы емес");  // болмаса оспелы емес
                    return;
                }
            } else {
                System.out.println("Оспелы емес");  // жай сан емес болса, оспелы емес деп шыгарамыз (жай сандар тызбегы емес)
                return;
            }
        }

        System.out.println();
    }
}