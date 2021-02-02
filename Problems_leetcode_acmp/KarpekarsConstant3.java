import java.util.Scanner;
public class KarpekarsConstant3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x = sc.nextInt();
        int pos = 0;
        while(true){
            int a1 = (x/100)%10;
            int a2 = (x/10)%10;
            int a3 = x%10;

            int min1 = Math.min(Math.min(a1,a2),a3);
            int max1 = Math.max(Math.max(a1,a2),a3);
            int mid1 = a1+a2+a3 - max1 - min1;

            int b1 = min1*100;
            int b2 = mid1*10;
            int b3 = max1;
            int OsuArkyly = b1+b2+b3;

            int c1 = max1*100;
            int c2 = mid1*10;
            int c3 = min1;
            int KemuArkyly = c1+c2+c3;
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