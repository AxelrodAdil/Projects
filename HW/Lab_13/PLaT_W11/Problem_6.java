package OOP_Java.PLaT_W11;

public class Problem_6 extends abstract_PLaT_W11{
    /**
     *
     * Created by Adil Myktybek
     * on 25.11.2020, 16:24
     *
     */
    private int a;
    private int b;

    public Problem_6(){}

    public Problem_6(String proplemIs_main, int a_main, int b_main){
        super(proplemIs_main);
        this.a = a_main;
        this.b = b_main;
    }

    public int getA(){ return a; }
    public int getB(){ return b; }
}
