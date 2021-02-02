import java.util.Scanner;
public class ACMP35 {
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        int k = sc.nextInt();
        for(int i =0; i<k; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int d = 19*m + (n + 239)*(n + 366) /2;
            System.out.println(d);
        }
        System.out.println();
    }
}
