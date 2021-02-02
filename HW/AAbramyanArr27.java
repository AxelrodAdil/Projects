import java.util.Scanner;

public class AAbramyanArr27 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int [] a = new int [n+2];
        for (int i=0; i<n; i++){
            int k = sc.nextInt();
            a[i]=k;
        }
        for (int j=0; j<n+1; j++){
            if(a[j]<0){
                if (a[j]<a[j+1]) {
                    System.out.println("0");
                } else {
                    System.out.println(j+1);
                    return;
                }
            } else {
                if (a[j]>a[j+1]) {
                    System.out.println("0");
                } else {
                    System.out.println(j+1);
                    return;
                }
            }
        }
        System.out.println();
    }
}