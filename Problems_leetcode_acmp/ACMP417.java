import java.util.Scanner;

public class ACMP417 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int k = sc.nextInt();
        int weekdays = 7;
        int day = 8;
        int month = 12;
        int year = 2019;
        for(int i=0; i<k; i++){
            int daysInFebruary;
            if(year%400==0 || year%4==0 && year%100!=0){
                daysInFebruary = 29;
            } else {
                daysInFebruary = 28;
            }

            int daysInMonth;
            if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12 ) {
                daysInMonth = 31;
            } else if(month==2){
                daysInMonth = daysInFebruary;
            } else{
                daysInMonth = 30;
            }

            if(day == 31 && month == 12){
               day=1;
               month=1;
               year++;
            } else if(day==daysInMonth){
                day=1;
                month++;
            } else {
                day++;
            }

            if(weekdays<7){
                weekdays++;
            } else {
                weekdays=1;
            }
        }

        if(weekdays==1){
            System.out.print("Monday");
        } else if(weekdays==2){
            System.out.print("Tuesday");
        } else if(weekdays==3){
            System.out.print("Wednesday");
        } else if(weekdays==4){
            System.out.print("Thursday");
        } else if(weekdays==5){
            System.out.print("Friday");
        } else if(weekdays==6){
            System.out.print("Saturday");
        } else if(weekdays==7){
            System.out.print("Sunday");
        } else {
            throw new Error();
        }
        System.out.println(", " + day/10 + day%10 + "." + month/10 + month%10);
    }
}