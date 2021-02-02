package OOP_Java.PLaT_W11;

public class Problem_12 extends abstract_PLaT_W11{
    /**
     *
     * Created by Adil Myktybek
     * on 30.11.2020, 14:50
     *
     */
    private String str_s;

    public Problem_12(){}

    public Problem_12(String proplemIs_main, String str_s_main){
        super(proplemIs_main);
        this.str_s = str_s_main;
    }

    public String getStr_s(){ return str_s; }
}
