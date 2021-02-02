import java.util.Scanner;
public class ACMP907 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int h = sc.nextInt();
        int w = sc.nextInt();
        int r = sc.nextInt();
        int min = Math.min(h,w);
        if(min>=2*r){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        System.out.println();
    }
}