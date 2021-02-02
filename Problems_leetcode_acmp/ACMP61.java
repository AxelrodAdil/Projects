import java.util.Scanner;

public class ACMP61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int a3 = sc.nextInt();
        int b3 = sc.nextInt();
        int a4 = sc.nextInt();
        int b4 = sc.nextInt();
        int perv = a1+a2+a3+a4;
        int vtor = b1+b2+b3+b4;
        if(perv>vtor)
            System.out.println(1);
        if(perv<vtor)
            System.out.println(2);
        if(perv == vtor)
            System.out.println("DRAW");
        System.out.println();
    }
}
