import java.util.Scanner;
public class KaprekarsConstant2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x = sc.nextInt();
        int pos = 0;
        while(true){
            int a1 = (x/10)%10;
            int a2 = x%10;

            int min1 = Math.min(a1,a2);
            int max1 = Math.max(a1,a2);

            int KemuArkyly = max1*10 + min1;
            int OsuArkyly = min1*10 + max1;

            x = KemuArkyly - OsuArkyly;
            if(x==9){
                break;
            }
            System.out.println(KemuArkyly+" - "+OsuArkyly+" = "+x);
            pos++;
        }
        System.out.println(x);
        System.out.println(pos);
    }
}