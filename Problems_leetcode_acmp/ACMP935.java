import java.util.Scanner;
public class ACMP935 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        if(Math.abs(x1-x2) == Math.abs(y1-y2)) {
            System.out.println("YES");
        }else if((x1+x2+y1+y2)%2 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        System.out.println();
    }
}