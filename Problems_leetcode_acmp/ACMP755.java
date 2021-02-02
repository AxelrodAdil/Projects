import java.util.Scanner;
public class ACMP755 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if(x+y<z){
            System.out.println("Impossible");
            System.exit(0);
        }
        int minus = (x+y)-z;
        System.out.println(minus);
    }
}