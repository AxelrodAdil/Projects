package OOP_Java.PLaT_W11;

import java.util.ArrayList;

public class Problem_14 extends abstract_PLaT_W11{
    /**
     *
     * Created by Adil Myktybek
     * on 30.11.2020, 14:50
     *
     */
    private ArrayList al_problem14;

    public Problem_14(){}

    public Problem_14(String proplemIs_main, ArrayList al_problem14_main){
        super(proplemIs_main);
        this.al_problem14 = al_problem14_main;
    }

    public ArrayList getAl_problem14(){ return al_problem14; }
}
