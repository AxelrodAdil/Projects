import java.util.Scanner;
public class ACMP694 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int maxF = sc.nextInt();
        int minS = sc.nextInt();
        int i = 1;
        while (i < n) {
            i++;
            int F = sc.nextInt();
            int S = sc.nextInt();
            maxF = Math.max(maxF,F);
            minS = Math.min(minS,S);
        }
        if(maxF<=minS){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}