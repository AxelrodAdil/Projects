package OOP_Java.PLaT_W11;

public class Problem_13 extends abstract_PLaT_W11{
    /**
     *
     * Created by Adil Myktybek
     * on 30.11.2020, 14:50
     *
     */
    private String str_s1;

    public Problem_13(){}

    public Problem_13(String proplemIs_main, String str_s1_main){
        super(proplemIs_main);
        this.str_s1 = str_s1_main;
    }

    public String getStr_s(){ return str_s1; }
}
