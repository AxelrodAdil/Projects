import java.util.Scanner;
public class ACMP754 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int minV = Math.min(Math.min(m1,m2),m3);
        int maxV = Math.max(Math.max(m1,m2),m3);
        if(minV<94){
            System.out.println("Error");
            System.exit(0);
        } else if(maxV>727){
            System.out.println("Error");
            System.exit(0);
        }
        System.out.println(maxV);
    }
}