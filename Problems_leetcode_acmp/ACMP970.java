import java.util.Scanner;
public class ACMP970 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        if(a1+a2==a3 || a1+a3==a2 || a2+a3==a1){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        System.out.println();
    }
}