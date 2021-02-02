package OOP_Java.Abstract_method;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<book_> array = new ArrayList<book_>(){
            //add("My life", 2035, "Adil");
        };
        do {
            book_ book = new book_();
            book.setBook_name("My life");
            book.setYear(2035);
            //array.add(array);
        } while (sc.nextLine().equals("y"));

        for(book_ c : array){
            System.out.println(c.getBook_name());
        }
        System.out.println("-----------------------------------");
        for(int i = 0; i < array.size(); i++){
            System.out.println(array.get(i).getYear());
        }

        /*author_ author = new author_();
        author.setAuthor_name("Adil");
        author.setBook_name("MY life");
        author.setYear(2035);
        System.out.println("--------------------------------");
        System.out.println(author.getAuthor_name());
        System.out.println(author.getBook_name());
        System.out.println(author.getYear ());
        System.out.println("--------------------------------");
       */
    }
}