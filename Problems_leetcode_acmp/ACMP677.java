import java.util.Scanner;
public class ACMP677 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int K = sc.nextInt();
        int N = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();
        if(K*N*M - N*M - K*N - K*M>0 && K*N*M*D %(K*N*M - N*M - K*N - K*M) == 0){
            int X = D*K*N*M/(K*N*M - K*M - K*N - M*N);
            if(X%K == 0 && X%N == 0 && X%M == 0){
                System.out.println(X);
            }else{
                System.out.println("-1");
            }
        }else{
            System.out.println("-1");
        }
        System.out.println("");
    }
}