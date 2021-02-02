package OOP_Java.PLaT_W11;

public abstract class abstract_PLaT_W11 {
    /**
     *
     * Created by Adil Myktybek
     * on 24.11.2020, 11:22
     *
     */
    private String proplemIs;

    public abstract_PLaT_W11(){}

    public abstract_PLaT_W11(String proplemIs_main){
        this.proplemIs = proplemIs_main;
    }

    public String getProplemIs(){ return proplemIs; }
}
