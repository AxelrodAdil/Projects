package HW;

import java.util.Scanner;

class Bmoney {
    private static double dollar_tenge = 421.50;
    private static double rubl_tenge = 5.62;
    void convert_dollar(double money){
        double ans = money/dollar_tenge;
        System.out.println(ans);
    }
}

public class W14_11 extends Bmoney{
    public static double money = 737.00;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Bmoney bmoney = new Bmoney();
        bmoney.convert_dollar(money);
    }
}

