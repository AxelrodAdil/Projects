package OOP_Java.LibraryStudent;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> allbooks;
    private ArrayList<Student> students;

    public Library() {}

    public ArrayList<Book> getAllbooks() {
        return allbooks;
    }

    public void setAllbooks(ArrayList<Book> allbooks) {
        this.allbooks = allbooks;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void listStudents(){
        for (int i = 0; i < students.size(); i++){
            System.out.println((i + 1) + " " + students.get(i));
        }
    }

    public void listBooks(){
        for (int i = 0; i < allbooks.size(); i++){
            System.out.println((i + 1) + " " + allbooks.get(i));
        }
    }
}