import java.util.Scanner;

public class ACMP264 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int days = sc.nextInt();
        int cur = 0;
        int dlina = 0;
        for(int i=0; i<days; i++) {
            int tC = sc.nextInt();
            if(tC>0){
                cur++;
            } else {
                cur = 0;
            }
            dlina = Math.max(dlina, cur);
        }
        System.out.println(dlina);
    }
}