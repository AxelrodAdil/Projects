import java.util.Scanner;
public class ACMP777 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        if(t1>t2){
            int Time = (t2+12)-t1;
            System.out.println(Time);
        } else if(t1<t2){
            int Time1 = t2-t1;
            System.out.println(Time1);
        }
        System.out.println();
    }
}