package Adil_Sept;

import java.util.Scanner;

public class PLaT_3seminar_2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];  // n-олшемды массив
        int tempPlus = 0;   // неше он сан бар екендыгын аныктау ушын
        int tempMinus = 0;  // неше терыс сан бар екендыгын аныктау ушын
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        double sumPlus = 0;  // он сандардын суммасы
        double sumMinus = 0; // сол сандардын суммасы
        for (int i = 0; i < n; i++){
            if (arr[i] < 0){
                tempMinus++;
                sumMinus += arr[i]; // суммасы
            } else if (arr[i] > 0){
                tempPlus++;
                sumPlus += arr[i];
            }
        }

        double a = sumMinus/tempMinus; // орташа арифетикасы
        double b = sumPlus/tempPlus;
        System.out.println(a*b);
    }
}
