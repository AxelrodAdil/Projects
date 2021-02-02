import java.util.Scanner;

public class ACMP539 {
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        int N = sc.nextInt();
        if(N == 1 || N==0){
            System.out.println("0");
            System.exit(0);
        }else if(N%2==0){
            System.out.println(N/2);
        }else{
            System.out.println(N);
        }
        System.out.println();
    }
}