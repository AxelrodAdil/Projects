import java.util.Scanner;

/**
 * @Author Adil
 * @create 04.07.2021 22:24
 */
public class B1542 {
    static Scanner sc = new Scanner(System.in);
    // 24 3 5
    /*
    1 -- 3 6
    3 -- 9 8           6 -- 18 11
    9 -- 27 14    8 -- 24 13   18 -- 54 23   11 -- 33 16
     */

    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0) solve();
    }

    static void solve(){
        int n=sc.nextInt(), a=sc.nextInt(), b=sc.nextInt();

        if(a==1) {
            if((n-1)%b==0) System.out.println("YES");
            else System.out.println("NO");
        } else {
            boolean bool=false;
            long start_=1;
            while(start_<=n) {
                if((n-start_)%b==0) {
                    bool=true;
                    break;
                }
                start_*=a;
            }
            if(bool) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}