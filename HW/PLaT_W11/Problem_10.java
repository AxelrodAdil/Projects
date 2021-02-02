package OOP_Java.PLaT_W11;

public class Problem_10 extends abstract_PLaT_W11{
    /**
     *
     * Created by Adil Myktybek
     * on 30.11.2020, 14:50
     *
     */
    private int a;
    private int b;

    public Problem_10(){}

    public Problem_10(String proplemIs_main, int a_main, int b_main){
        super(proplemIs_main);
        this.a = a_main;
        this.b = b_main;
    }

    public int getA(){ return a; }
    public int getB(){ return b; }
}
