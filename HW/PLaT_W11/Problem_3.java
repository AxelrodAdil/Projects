package OOP_Java.PLaT_W11;

public class Problem_3 extends abstract_PLaT_W11{
    /**
     *
     * Created by Adil Myktybek
     * on 24.11.2020, 11:22
     *
     */
    private int day;
    private int month;
    private int year;

    public Problem_3(){}

    public Problem_3(String proplemIs_main, int day_main, int month_main, int year_main){
        super(proplemIs_main);
        this.day = day_main;
        this.month = month_main;
        this.year = year_main;
    }

    public int getDay(){ return day; }
    public int getMonth(){ return month; }
    public int getYear(){ return year; }
}