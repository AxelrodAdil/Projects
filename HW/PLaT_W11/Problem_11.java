package OOP_Java.PLaT_W11;

import java.util.ArrayList;

public class Problem_11 extends abstract_PLaT_W11{
    /**
     *
     * Created by Adil Myktybek
     * on 30.11.2020, 14:50
     *
     */
    private ArrayList array_11;

    public Problem_11(){}

    public Problem_11(String proplemIs_main, ArrayList array_11_main){
        super(proplemIs_main);
        this.array_11 = array_11_main;
    }

    public ArrayList getArray_11(){ return array_11; }
}
