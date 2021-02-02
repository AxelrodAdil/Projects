import java.util.Scanner;

public class ACMP490 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int day = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        int d1 = sc.nextInt();
        int m1 = sc.nextInt();
        int y1 = sc.nextInt();
        int count = 0;
        //  while(d!=d1 || m!=m1 || y!=y1)
        while(!(day==d1 && m==m1 && y==y1)){
            count++;
            int daysInMonth;
            if(m==2){
                daysInMonth = 28;
            } else if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
                daysInMonth = 31;
            } else {
                daysInMonth = 30;
            }

            if(day==31 && m==12){
                day=1;
                m=1;
                y++;
            } else if(day == daysInMonth){
                day=1;
                m++;
            } else {
                day++;
            }
        }
        System.out.println(count);
    }
}