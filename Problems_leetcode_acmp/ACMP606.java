import java.util.Scanner;
public class ACMP606 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if(x+y>z && x+z>y && y+z>x){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        System.out.println();
    }
}