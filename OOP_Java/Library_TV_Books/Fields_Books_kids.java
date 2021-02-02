package OOP_Java.Library_TV_Books;

public class Fields_Books_kids extends Fields_Books{
    private int age;

    public Fields_Books_kids(){}

    Fields_Books_kids(long barcode, long regularPrice, String title_main, String publisher_main, int yearPublished_main, int age_main){
        super(barcode, regularPrice, title_main, publisher_main,yearPublished_main);
        this.age = age_main;
    }

    @Override
    public double totalPrice() {
        return getRegularPrice();
    }

    public double AVG_kids(){
        return age;
    }
}