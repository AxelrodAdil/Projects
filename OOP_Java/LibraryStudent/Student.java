package OOP_Java.LibraryStudent;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private String surname;
    private String group;
    private ArrayList<Book> books;

    public Student(int id, String name, String surname, String group, ArrayList<Book> books) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.books = books;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBookToStudent(Book b){
        books.add(b);
    }

    public void studentsBooks (){
        for (int i = 0; i < books.size(); i++){
            System.out.println((i + 1) + " " + books.get(i));
        }
    }

    public void deleteBook(int n){
        books.remove(n);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + surname + " " + group;
    }
}
