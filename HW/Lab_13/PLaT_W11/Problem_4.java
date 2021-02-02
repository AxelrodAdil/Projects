package OOP_Java.PLaT_W11;

public class Problem_4 extends abstract_PLaT_W11{
    /**
     *
     * Created by Adil Myktybek
     * on 24.11.2020, 11:22
     *
     */
    private int sec;
    private int min;
    private int hour;

    public Problem_4(){}

    public Problem_4(String proplemIs_main, int sec_main, int min_main, int hour_main){
        super(proplemIs_main);
        this.sec = sec_main;
        this.min = min_main;
        this.hour = hour_main;
    }

    public int getSec(){ return sec; }
    public int getMin(){ return min; }
    public int getHour(){ return hour; }
}
