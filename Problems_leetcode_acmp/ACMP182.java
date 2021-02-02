import java.util.Scanner;
public class ACMP182 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // x4 & y4?
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        int d12 = (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);
        int d23 = (x3-x2)*(x3-x2) + (y3-y2)*(y3-y2);
        int d13 = (x3-x1)*(x3-x1) + (y3-y1)*(y3-y1);

        if(d12 == d23+d13){
            int x4 = x1+x2-x3;
            int y4 = y1+y2-y3;
            System.out.println(x4);
            System.out.println(y4);
        }else if(d23 == d12+d13){
            int x4 = x2+x3-x1;
            int y4 = y2+y3-y1;
            System.out.println(x4);
            System.out.println(y4);
        }else if(d13 == d12+d23){
            int x4 = x1+x3-x2;
            int y4 = y1+y3-y2;
            System.out.println(x4);
            System.out.println(y4);
        }

        System.out.println();
    }
}