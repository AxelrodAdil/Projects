package Solutions;
import java.util.Scanner;
public class ACMP330 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        if(Math.abs(x1-x2) == Math.abs(y1-y2)){
            System.out.println(1);
        } else if((x1+x2+y1+y2)%2 != 0){
            System.out.println(0);
        }else{
            System.out.println(2);
        }
        System.out.println();
    }
}