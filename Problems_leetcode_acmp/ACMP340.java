import java.util.Scanner;
public class ACMP340 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();
        if (a1>0 && a2>0 && b1>0 && b2>0 && c1>0 && c2>0){
            if (a1 == a2 && b1 == b2 && c1 == c2 || a1 == a2 && c1 == b2 && b1 == c2
                    || b1 == a2 && a1 == b2 && c1 == c2 || b1 == a2 && c1 == b2 && a1 == c2
                    || c1 == a2 && b1 == b2 && a1 == c2 || c1 == a2 && a1 == b2 && b1 == c2) {
                System.out.println("Boxes are equal");
            } else if (b1 >= a2 && a1 >= b2 && c1 >= c2 || b1 >= a2 && c1 >= b2 && a1 >= c2
                    || a1 >= a2 && b1 >= b2 && c1 >= c2 || a1 >= a2 && c1 >= b2 && b1 >= c2
                    || c1 >= a2 && b1 >= b2 && a1 >= c2 || c1 >= a2 && a1 >= b2 && b1 >= c2) {
                System.out.println("The first box is larger than the second one");
            } else if (a1 <= a2 && b1 <= b2 && c1 <= c2 || a1 <= a2 && c1 <= b2 && b1 <= c2
                    || b1 <= a2 && a1 <= b2 && c1 <= c2 || b1 <= a2 && c1 <= b2 && a1 <= c2
                    || c1 <= a2 && b1 <= b2 && a1 <= c2 || c1 <= a2 && a1 <= b2 && b1 <= c2) {
                System.out.println("The first box is smaller than the second one");
            } else {
                System.out.println("Boxes are incomparable");
            }
        }else{
            System.out.println("ERROR");
            System.exit(0);
        }
        System.out.println();
    }
}