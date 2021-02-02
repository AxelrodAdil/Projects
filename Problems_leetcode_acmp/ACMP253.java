import java.util.Scanner;

public class ACMP253 {
    // How many strokes the clock made in this period of time...
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int strokes = 0;
        while (h1!=h2 || m1!=m2) {
            if (m1==30) {
                strokes++;
            } else if (m1==0) {
                strokes += (h1+12-1)%12+1;
            }
            m1++;
            h1 += m1/60;
            m1 %= 60;
            h1 %= 24;
        }
        System.out.println(strokes);
    }
}