import java.util.Scanner;

public class KarpekarsConstant4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x = sc.nextInt();
        int pos = 0;
        while(true){
            int a1 = x/1000;
            int a2 = (x/100)%10;
            int a3 = (x/10)%10;
            int a4 = x%10;

            int min1 = Math.min(Math.min(a1,a2),Math.min(a3,a4));
            int max1 = Math.max(Math.max(a1,a2),Math.max(a3,a4));
            int mid11 = Math.max(Math.min(a1,a2),Math.min(a3,a4));
            int mid22 = Math.min(Math.max(a1,a2),Math.max(a3,a4));
            int mid01 = Math.min(mid11,mid22);
            int mid02 = Math.max(mid11,mid22);

            int b1 = min1*1000;
            int b2 = mid01*100;
            int b3 = mid02*10;
            int b4 = max1;
            int OsuArkyly = b1+b2+b3+b4;

            int c1 = max1*1000;
            int c2 = mid02*100;
            int c3 = mid01*10;
            int c4 = min1;
            int KemuArkyly = c1+c2+c3+c4;
            int prev = x;
            x = KemuArkyly - OsuArkyly;
            if(x==prev){
                break;
            }
            System.out.println(KemuArkyly+" - "+OsuArkyly+" = "+x);
            pos++;
        }
        System.out.println(x);
        System.out.println(pos);
    }
}