import java.util.Scanner;
public class ACMP529 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int d = (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2);
        double dlina = Math.sqrt(d);
        System.out.println(dlina);
    }
}