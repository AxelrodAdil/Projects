package OOP_Java.PLaT_W11;

public class Problem_1 extends abstract_PLaT_W11{
    /**
     *
     * Created by Adil Myktybek
     * on 24.11.2020, 11:22
     *
     */
    private int n;

    public Problem_1(){}

    public Problem_1(String proplemIs_main, int n_main){
        super(proplemIs_main);
        this.n = n_main;
    }

    public int getN(){ return n; }
}