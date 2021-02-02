import java.util.Scanner;
public class ACMP692 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        if (n==1 || n==2 || n==4 || n==8 || n==16 || n==32 || n==64 || n==128 || n==256 || n==512 || n==1024 || n==2048 || n==4096 || n==8192 ) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        System.out.println();
    }
}