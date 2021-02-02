import java.util.Scanner;

public class ACMP296 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        for(int i=0; i<=4; i++){
            if((n-i*3)%5 == 0){
                int k = (n-i*3)/5;
                System.out.println(k+" "+i);
                return;
            }
        }
        throw new Error();
    }
}