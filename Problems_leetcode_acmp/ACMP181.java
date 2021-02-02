import java.util.Scanner;
public class ACMP181 {
    // ...TIME LIMIT EXCEEDED...
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(a!=b){
            if(a>b){
                a -= b;
            }else{
                b -= a;
            }
        }
        System.out.println(a);
    }
}
