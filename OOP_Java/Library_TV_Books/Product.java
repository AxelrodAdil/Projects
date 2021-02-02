package OOP_Java.Library_TV_Books;

public abstract class Product {
    private long barcode;
    private double regularPrice;

    public Product(){}

    public Product (long barcode_main, long regularPrice_main){
        this.barcode = barcode_main;
        this.regularPrice = regularPrice_main;
    }

    public long getBarcode() { return barcode; }
    public double getRegularPrice() { return regularPrice; }

    abstract public double totalPrice();
    abstract public double AVG_kids();
}
