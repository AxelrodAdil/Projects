package OOP_Java.PLaT_W11;

public class Problem_2 extends abstract_PLaT_W11{
    /**
     *
     * Created by Adil Myktybek
     * on 24.11.2020, 11:22
     *
     */
    private String string;

    public Problem_2(){}

    public Problem_2(String proplemIs_main, String string_main){
        super(proplemIs_main);
        this.string = string_main;
    }

    public String getString(){ return string; }
}
