import java.util.Scanner;

public class ACMP316{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        if(n%107<=7){
            System.out.println(n/107*100+" "+n/107*7);
        }else{
            System.out.println(n/107*100+n%107-7+" "+(n/107*7+7));
        }
        System.out.println();
    }
}