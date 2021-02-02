import java.util.Scanner;

public class ACMP246 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int prev = sc.nextInt();
        int cuts = 0;
        for(int i=1; i<n; i++){
            int curr = sc.nextInt();
            if(prev+1 != curr){
                cuts++;
            }
            prev = curr;
        }
        System.out.println(cuts);
    }
}