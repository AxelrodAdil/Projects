import java.util.Scanner;
public class ACMP929 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x = sc.nextInt();
        if(x==3 || x==4 || x==5){
            System.out.println("Spring");
        } else if(x==6 || x==7 || x==8){
            System.out.println("Summer");
        } else if(x==9 || x==10 || x==11){
            System.out.println("Autumn");
        } else if(x==12 || x==1 || x==2){
            System.out.println("Winter");
        } else {
            System.out.println("Error");
        }
        System.out.println();
    }
}