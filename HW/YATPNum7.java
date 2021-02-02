package Adil_Sept;

import java.util.Scanner;

public class YATPNum7 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x = sc.nextInt();
        for (int i = 1; i < x; i++){
            for (int j = 1; j < x; j++) {
                if (x == (i * i + j * j)) {
                    System.out.println("YES");
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}