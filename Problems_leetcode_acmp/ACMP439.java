import java.util.Scanner;
// zakon Amdala

public class ACMP439 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int p = sc.nextInt();
        int a = sc.nextInt();
        double sp = 100.0/(a+((100.0-a)/p));
        System.out.println(sp);
    }
}