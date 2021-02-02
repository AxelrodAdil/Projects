import java.util.Scanner;

public class AAbramyan19 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int []a = new int [10];
        for (int i=0; i<10; i++){
            int k = sc.nextInt();
            a[i] = k;
        }
        for (int i=9; i>=0; i--){
            if (a[i]<a[9] && a[i]>a[0]){
                System.out.println(i+" : "+a[i]);
                return;
            }
        }
        System.out.println(0);
    }
}