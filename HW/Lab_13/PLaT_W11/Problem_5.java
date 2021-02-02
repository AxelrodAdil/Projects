package OOP_Java.PLaT_W11;

import java.util.HashSet;

public class Problem_5 extends abstract_PLaT_W11{
    /**
     *
     * Created by Adil Myktybek
     * on 24.11.2020, 11:22
     *
     */
    private HashSet <Integer> hashSet;

    public Problem_5(){}

    public Problem_5(String proplemIs_main, HashSet<Integer> hashSet_main){
        super(proplemIs_main);
        this.hashSet = hashSet_main;
    }

    public String getStringHashSet(){ return hashSet.toString(); }
    public HashSet getHashSet(){ return hashSet; }
}
