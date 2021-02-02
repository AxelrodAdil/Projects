package Adil_Sept;

import java.util.Scanner;

public class YATPNum11 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x < y){ System.out.println("NO"); return; }
        System.out.println("Yes");

        System.out.println(x/y + " " + x%y + "/" + y);
    }
}