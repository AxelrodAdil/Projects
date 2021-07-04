package Solutions;

import java.util.Scanner;

public class ACMP170 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x = sc.nextInt();
        int count = 1;
        for(int pos = 2; 2*x-(pos-1)*pos >= 2*pos; pos++){
            if((2*x-(pos-1)*pos)%(2*pos)==0){
                count = pos;
            }
        }
        System.out.println(count);
    }
}