import java.util.Scanner;
public class ACMP94 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt(); //sword
        int m = sc.nextInt(); //heads
        int k = sc.nextInt(); //recovery
        if(m<=n){
            System.out.println("1");
        }else if(n<=k && m-n>0){
            System.out.println("NO");
        }else{
            //... (m-n-1)/(n-k)+2 ...
            //... (m+k-2n)/^n-k === 1+(m-n)/n-k ...
            //System.out.println(1+(m+k-n-n+n-k)/(n-k)) or System.out.println(1+(m-n)/(n-k));
            //pochemu wrong???
            System.out.println((m-n-1)/(n-k) +2);
        }
        System.out.println();
    }
}