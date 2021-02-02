package OOP_Java.PLaT_W11;

import java.util.ArrayList;

public class Problem_15 extends abstract_PLaT_W11{
    /**
     *
     * Created by Adil Myktybek
     * on 30.11.2020, 14:50
     *
     */
    private ArrayList all_15;

    public Problem_15(){}

    public Problem_15(String proplemIs_main, ArrayList all_15_main){
        super(proplemIs_main);
        this.all_15 = all_15_main;
    }

    public ArrayList getAll_15(){ return all_15; }
}
