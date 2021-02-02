import java.util.Scanner;
public class ACMP756 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(m*n-m-n+1);
    }
}