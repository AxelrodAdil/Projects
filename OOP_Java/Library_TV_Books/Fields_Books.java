package OOP_Java.Library_TV_Books;

public class Fields_Books extends Product {
    private String title;
    private String publisher;
    private int yearPublished;

    public Fields_Books(){}

    Fields_Books(long barcode, long regularPrice, String title_main, String publisher_main, int yearPublished_main){
        super(barcode, regularPrice);
        this.title = title_main;
        this.publisher = publisher_main;
        this.yearPublished = yearPublished_main;
    }

    @Override
    public double totalPrice() {
        return getRegularPrice();
    }

    @Override
    public double AVG_kids() {
        return 0;
    }

    public String getTitle(){ return title; }
    public String getPublisher(){ return publisher; }
    public int getYearPublished(){ return yearPublished; }
}
