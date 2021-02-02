import java.util.Scanner;

public class ACMP651 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = n;
        int b = m;
        while(b>0){
            int t = a%b;
            a = b;
            b = t;
        }
        n /= 2;
        m /= a;
        int count = 0;
        //............................................................................
        // LATER

        System.out.println();
    }
}