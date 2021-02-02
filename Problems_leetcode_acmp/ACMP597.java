import java.util.Scanner;
public class ACMP597 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        int r3 = sc.nextInt();
        if(r3+r2 > r1){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
        System.out.println();
    }
}