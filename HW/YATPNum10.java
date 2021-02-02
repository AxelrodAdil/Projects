package Adil_Sept;

import java.util.Scanner;

public class YATPNum10 {
    static Scanner sc = new Scanner(System.in);

    /**
     * https://ru.wikipedia.org/wiki/%D0%A1%D0%BF%D0%B8%D1%81%D0%BE%D0%BA_%D0%BF%D1%80%D0%BE%D1%81%D1%82%D1%8B%D1%85_%D1%87%D0%B8%D1%81%D0%B5%D0%BB
     */

    public static int gcd(int x, int y) {
        int c;
        while (y > 0) {
            c = x % y;
            x = y;
            y = c;
        }
        return Math.abs(x);
    }

    public static void main(String[] args) {
        int x = sc.nextInt();
        int y = sc.nextInt();

        /*for (int i = 2; i < x; i++){
            if (x%i == 0){
                System.out.println("Not simple");
                return;
            }
        }
        System.out.println("Simple!");*/

        System.out.println("------------");
        int gcdNum = gcd(x, y);
        if (gcdNum == 1){
            System.out.println("Ozara jai sandar!");
            return;
        }

        System.out.println("Ozara jai sandar emes...");
    }
}