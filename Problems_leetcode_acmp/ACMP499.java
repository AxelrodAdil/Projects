import java.util.Scanner;
public class ACMP499 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int number = sc.nextInt();
        int weight = sc.nextInt();
        int w1= sc.nextInt();
        int n1= sc.nextInt();
        int w2= sc.nextInt();
        int n2= sc.nextInt();
        int w3= sc.nextInt();
        int n3= sc.nextInt();

        if(n1>=number && w1<=weight
                || n2>=number && w2<=weight
                || n3>=number && w3<=weight
                || n1+n2>=number && w1+w2<=weight
                || n1+n3>=number && w1+w3<=weight
                || n2+n3>=number && w2+w3<=weight
                || n1+n2+n3>=number && w1+w2+w3<=weight) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        System.out.println();
    }
}