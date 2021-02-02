import java.util.Scanner;
public class ACMP933 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int t = sc.nextInt();
        if(t<=a){
            System.out.println(b*t);
        } else {
            int sverh = t-a;
            System.out.println(a*b + sverh*c);
        }
    }
}