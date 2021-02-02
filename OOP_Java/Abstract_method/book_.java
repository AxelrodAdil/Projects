package OOP_Java.Abstract_method;

public class book_ {

    private String book_name;
    private int year;

    public book_(){}
    public book_(String book_name_main, int year_main){
        this.book_name = book_name_main;
        this.year = year_main;
    }

    public String getBook_name(){ return book_name; }
    public int getYear(){ return year; }

    public void setBook_name(String string1){ this.book_name = string1; }
    public void setYear(int year1){ this.year = year1; }
}
