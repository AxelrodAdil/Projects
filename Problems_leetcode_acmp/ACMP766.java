import java.util.Scanner;
public class ACMP766 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        if(n*m<k){
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
        System.out.println();
    }
}