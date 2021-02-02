package OOP_Java.PLaT_W11;

public class Problem_7 extends abstract_PLaT_W11{
    /**
     *
     * Created by Adil Myktybek
     * on 30.11.2020, 14:50
     *
     */
    private int line;
    private int column;

    public Problem_7(){}

    public Problem_7(String proplemIs_main, int line_main, int column_main){
        super(proplemIs_main);
        this.line = line_main;
        this.column = column_main;
    }

    public int getLine(){ return line; }
    public int getColumn(){ return column; }
}