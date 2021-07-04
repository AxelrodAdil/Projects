import java.util.Scanner;

/**
 * @Author Adil
 * @create 04.07.2021 22:25
 */
public class A058 {
    static Scanner sc = new Scanner(System.in);

    static void solve(){
        String str=sc.nextLine();
        String ans="hello";
        if(str.length()<5) {
            System.out.println("NO");
            return;
        }
        for(int i=0, j=0; i<str.length(); i++){
            if(str.charAt(i)==ans.charAt(j)) j++;
            if(j==5) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
    public static void main(String[] args) {
        //int t=sc.nextInt();
        int t=1;
        while(t-->0) {
            solve();
        }
    }
}