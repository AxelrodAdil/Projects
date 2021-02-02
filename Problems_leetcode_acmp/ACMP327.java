import java.util.Scanner;
public class ACMP327 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();

            int value2A = x + 1;
            int b1 = value2A/100000;
            int b2 = value2A/10000 % 10;
            int b3 = value2A/1000 % 10;
            int b4 = value2A/100 % 10;
            int b5 = value2A/10 % 10;
            int b6 = value2A%10;
            int v2AA = b1+b2+b3;
            int v2AB = b4+b5+b6;

            int value2B = x - 1;
            int c1 = (value2B/100000);
            int c2 = (value2B/10000 % 10);
            int c3 = (value2B/1000 % 10);
            int c4 = (value2B/100 % 10);
            int c5 = (value2B/10 % 10);
            int c6 = (value2B%10);
            int v2BA = c1+c2+c3;
            int v2BB = c4+c5+c6;

            if(v2AA==v2AB) {
                System.out.println("Yes");
            }else if(v2BA==v2BB){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        System.out.println();
    }
}