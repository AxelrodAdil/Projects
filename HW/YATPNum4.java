package Adil_Sept;
import java.util.Scanner;

public class YATPNum4 {
    static Scanner sc = new Scanner(System.in);

    private int x;
    private int y;

    public YATPNum4(int startX, int startY) {
        x = startX;
        y = startY;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public double distance(YATPNum4 otherPt) {
        int dx = x - otherPt.getX();
        int dy = y - otherPt.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        YATPNum4 p1 = new YATPNum4(0, y1);
        YATPNum4 p2 = new YATPNum4(x2, 0);
        YATPNum4 p3 = new YATPNum4(0, 0);
        int distP3_P1 = (int)p3.distance(p1);
        int distP3_P2 = (int)p3.distance(p2);
        int distP2_P1 = (int)p2.distance(p1);
        //System.out.println(distP3_P1);
        //System.out.println(distP3_P2);
        //System.out.println(distP2_P1);

        int distC = distP3_P1*distP3_P1 + distP3_P2*distP3_P2;
        //System.out.println(distP3_P1*distP3_P1);
        //System.out.println(distP3_P2*distP3_P2);

        if (distP2_P1*distP2_P1 == distC){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");

        /**
         * Берілген мандер өте аз! Тікбурышыты ушбурыш куру ушын кем дегеде 3 нукте коорд. немесе
         * ушбурыштын градустары берілуі тиіс.
         */
    }
}