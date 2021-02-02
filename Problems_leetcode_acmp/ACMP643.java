import java.util.Scanner;

public class ACMP643 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int count = 0;
        int n1 = n;
        while(n > 0){
            if(n%2 == 1){
                count++;
            }
            n /= 2;
        }
        System.out.println(n1 + count);
    }
}