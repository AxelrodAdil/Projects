import java.util.Scanner;

public class ACMP521 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        //int max = 0;
        int p = sc.nextInt();
        int k = sc.nextInt();
        int pos = 0;
        for(int i=p; i<=k; i++){
            int s = i;
            while(s != 2){
                if(s%2==0){
                    s /= 2;
                } else {
                    s= s*3+1;
                }
               //max = Math.max(max,s);
                pos++;
            }
        }
        System.out.println(pos);
        //System.out.println(max);
    }
}