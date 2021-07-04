import java.util.Scanner;

/**
 * @Author Adil
 * @create 04.07.2021 22:21
 */
public class A110 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        long n=sc.nextLong(), count=0;
        String str=String.valueOf(n);
        boolean b=false;
        for (int i=0;i<str.length();i++){
            if(n%10==7 || n%10==4) {
                count++;
                b=true;
            }
            n/=10;
        }
        // 4744000695826
        /*if(str.length()==4 && count==4 || str.length()==4 && count==7
                || str.length()==7 && count==4 || str.length()==7 && count==7) System.out.println("YES");
        else System.out.println("NO");*/
        if(b && count==4 || b && count==7) System.out.println("YES");
        else System.out.println("NO");
    }
}
