import java.util.Scanner;
public class ACMP147A {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int prev = 1;
        int cur = 1;
        int pos = 2;
        while (pos<n) {
            int next = prev + cur;
            System.out.println(next);
            prev = cur;
            cur = next;
        }
        System.out.println();
    }
}