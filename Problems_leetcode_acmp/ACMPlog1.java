import java.util.Scanner;

public class ACMPlog1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x = sc.nextInt();
        int n = sc.nextInt();
        double top = 1;
        double down = 1;
        int s = x;
        int gg2 = n;
        for(int i=1; i<n; i++){
            top *= 2*i-1;
            down *= 2*i;
            gg2 *= x*x;
            s += top*gg2/(down*(2*i+1));
        }
        System.out.println(s);
    }
}