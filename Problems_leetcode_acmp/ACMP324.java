import java.util.Scanner;
public class ACMP324 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int N = sc.nextInt();
        int a1 = N/1000;
        int a2 = N/100%10;
        int a3 = N/10%10;
        int a4 = N%10;
        if(a1==a4){
            if(a2==a3){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }else{
            System.out.println("NO");
        }
        System.out.println();
    }
}