import java.util.Scanner;
public class ACMP148 {
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        int k = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<k; i++){
            int a1 = sc.nextInt();
            min = Math.min(min,a1);
            max = Math.max(max,a1);
        }
        System.out.println(min);
        System.out.println(max);
    }
}
