package Adil_Sept;

import java.util.Scanner;

public class YATPNum9 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = sc.nextInt(), i;
        String temp = Integer.toString(x);
        int[] arrNum = new int [temp.length()];
        for (i = 0; i < temp.length(); i++){
            arrNum[i] = temp.charAt(i) - '0';
        }

        for (i = 0; i < temp.length(); i++){
            for (int j = i + 1; j < temp.length(); j++){
                if (arrNum[i] == arrNum[j]){
                    System.out.println("Same numbers");
                    return;
                }
            }
        }
        System.out.println("GOOD");
    }
}