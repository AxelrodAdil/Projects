package Solutions;

import java.util.Scanner;

public class ACMP645 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        // k-h*w ==> w = k/h
        int k = sc.nextInt();
        int minBeauty = k;
        int minh = 1;
        int minw = 1;
        for(int h=2; h <= k/h; h++){
            int w = k/h;
            int beauty = Math.abs(h-w) + k-h*w;
            if(beauty < minBeauty){
                minBeauty = beauty;
                minh = h;
                minw = w;
            }
        }
        System.out.println(minh + " " + minw);
    }
}