package Solutions;

import java.util.Arrays;
import java.util.Scanner;

public class ACMP119 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            int h = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();
            arr[i] = h*3600+m*60+s;
        }
        Arrays.sort(arr);
        for(int i = 0; i< arr.length; i++){
            int h = arr[i]/3600;
            int m = arr[i]/60%60;
            int s = arr[i]%60;
            System.out.println(h+" "+m+" "+s);
        }
    }
}