import java.util.Scanner;
public class ACMP271 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int prev = 1;
        int cur = 1;
        int pos = 2;
        while (cur < n) {
            int next = prev + cur;
            prev = cur;
            cur = next;
            pos ++;
        }
        if(cur == n){
            System.out.println(1);
            System.out.println(pos);
        }else{
            System.out.println(0);
        }
        System.out.println();
    }
}