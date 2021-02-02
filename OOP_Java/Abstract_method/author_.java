package OOP_Java.Abstract_method;

public class author_ { // extends book_
    private String author_name;

    public author_(){}

    public author_(String book_name, int year, String author_name_main){
        // super(book_name, year);
        this.author_name = author_name_main;
    }

    public String getAuthor_name(){ return author_name; }
    public void setAuthor_name(String str){
        this.author_name = str;
    }

}
