import java.util.Scanner;

public class ACMP208 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int pow = 1;
        while(pow*2 <=n){
            pow *= 2;
        }
        int n0 = n;
        int max = n;
        do{
            n = n/2 + n%2 * pow;
            max = Math.max(max,n);
        } while (n != n0);
        System.out.println(max);
    }
}