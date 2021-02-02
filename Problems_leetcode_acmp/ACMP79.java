import java.util.Scanner;
public class ACMP79 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int f = 1;
        for(int i=0; i<b; i++){
            f = (f*a)%10;
        }
        System.out.println(f);
    }
}