import java.util.Scanner;

public class ACMP688A {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        long suslikX = sc.nextLong();
        long suslikY = sc.nextLong();
        long dogX = sc.nextLong();
        long dogY = sc.nextLong();
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            long burrowX = sc.nextLong();
            long burrowY = sc.nextLong();
            if( 4 * ((burrowX - suslikX) * (burrowX - suslikX) + (burrowY - suslikY) * (burrowY - suslikY)) <= ((burrowX - dogX) * (burrowX - dogX) + (burrowY - dogY) * (burrowY - dogY))){
                System.out.println(i);
                return;
            }
            /*long hypoSuslik = 4 * ((burrowX - suslikX) * (burrowX - suslikX) + (burrowY - suslikY) * (burrowY - suslikY));
            long hypoDog = ((burrowX - dogX) * (burrowX - dogX) + (burrowY - dogY) * (burrowY - dogY));
            if (hypoSuslik <= hypoDog) {
                System.out.println(i);
                return;
            }
            */
        }
        System.out.println("NO");
    }
}