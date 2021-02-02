package OOP_Java.PLaT_W11;

public class Problem_9 extends abstract_PLaT_W11{
    /**
     *
     * Created by Adil Myktybek
     * on 30.11.2020, 14:50
     *
     */
    private int a_1;
    private int a_2;
    private int b_1;
    private int b_2;
    private int c_1;
    private int c_2;

    public Problem_9(){}

    public Problem_9(String proplemIs_main, int a_1_main, int a_2_main, int b_1_main, int b_2_main, int c_1_main, int c_2_main){
        super(proplemIs_main);
        this.a_1 = a_1_main;
        this.a_2 = a_2_main;
        this.b_1 = b_1_main;
        this.b_2 = b_2_main;
        this.c_1 = c_1_main;
        this.c_2 = c_2_main;
    }

    public int getA_1(){ return a_1; }
    public int getA_2(){ return a_2; }
    public int getB_1(){ return b_1; }
    public int getB_2(){ return b_2; }
    public int getC_1(){ return c_1; }
    public int getC_2(){ return c_2; }
}