import java.util.Scanner;
public class ACMP511 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int k = sc.nextInt();
        if(k>0 && k<250) {
            if(k>145){
                System.out.println("NO");
            }else{
                int totalMin = (k-1)*5;
                int hour = totalMin/60;
                int min = totalMin%60;
                System.out.println(hour+" "+min);
            }
        }
        System.out.println();
    }
}