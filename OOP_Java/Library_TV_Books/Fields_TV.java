package OOP_Java.Library_TV_Books;

public class Fields_TV extends Product {
    private String typeTV;
    private double screenSize;

    public Fields_TV(){}

    public Fields_TV (long barcode, long regularPrice, String typeTV_main, double screenSize_main){
        super(barcode, regularPrice);
        this.typeTV = typeTV_main;
        this.screenSize = screenSize_main;
    }

    @Override
    public double totalPrice() {
        return getRegularPrice();
    }

    @Override
    public double AVG_kids() {
        return 0;
    }


    public String getTypeTV(){ return typeTV; }
    public double getScreenSize(){ return screenSize; }
}