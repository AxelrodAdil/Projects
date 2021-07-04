import java.util.Scanner;
public class ACMP667 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int deti = sc.nextInt(); //N
        int vzroslye = sc.nextInt(); //M
        int vmeshaetAvtobus = sc.nextInt(); //K
        if (vmeshaetAvtobus <= 2) {
            System.out.println(0);
        } else if (vzroslye < (deti + vmeshaetAvtobus - 2 - 1) / (vmeshaetAvtobus - 2) * 2) {
            System.out.println(0);
        } else {
            System.out.println((deti + vzroslye + vmeshaetAvtobus - 1) / (vmeshaetAvtobus));
        }
        System.out.println();
    }
}