import java.util.Scanner;
public class ACMP504 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int K = sc.nextInt();
        if(K%3==0){
            System.out.println("GCV");
        } else if(K%3==1){
            System.out.println("VGC");
        }else if(K%3==2) {
            System.out.println("CVG");
        }
        System.out.println();
    }
}