import java.util.Scanner;

public class ACMP394 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int nPolena = sc.nextInt();
        int timeValue = sc.nextInt();
        int a1 = sc.nextInt();
        int max = a1;
        int sum = a1;
        for(int i=1; i<nPolena; i++){
            int ai = sc.nextInt();
            max = Math.max(max, ai);
            sum += ai;
        }
        if(max <= timeValue && timeValue <= sum-(nPolena-1)){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        System.out.println();
    }
}