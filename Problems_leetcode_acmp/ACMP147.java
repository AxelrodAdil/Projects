import java.util.Scanner;
public class ACMP147 {
    // ... LATER ...
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int prev = 0;
        if(n == 1){
            System.out.println(1);
            System.exit(0);
        }
        int cur = 1;
        int pos = 1;
        int next = 0;
        while (pos<n) {
            next = prev + cur;
            prev = cur;
            cur = next;
            pos ++;
        }
        System.out.println(next);
    }
}