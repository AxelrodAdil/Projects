package OOP_Java.LibraryStudent;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        Library library = new Library();
        int n = 100;
        while(n != 0) {
            System.out.println("[1] Add book\n[2] Add student \n[3] Assign a book to student \n[4] Remove a book from particular student\n[5] All books and students in library\n[6] Students books\n[0]Exit");
            n = scn.nextInt();
            switch (n){
                case 1 : {
                    System.out.println("How many books do you want to add? ");
                    int q = scn.nextInt();
                    String name, author, isbn;
                    int year, quantity;
                    ArrayList<Book> books = new ArrayList<>();
                    while(q > 0) {
                        System.out.println("Enter information about book: ");
                        System.out.println("Enter name of book: ");
                        name = scn.skip("\n").nextLine();
                        System.out.println("Enter author of book: ");
                        author = scn.nextLine();
                        System.out.println("Enter isbn of book: ");
                        isbn = scn.nextLine();
                        System.out.println("Enter year of book: ");
                        year = scn.nextInt();
                        System.out.println("Enter quantity of book: ");
                        quantity =scn.nextInt();
                        books.add(new Book(name, author, isbn, year, quantity));
                        q--;
                    }
                    library.setAllbooks(books);
                    System.out.println("You added books!");
                    break;
                }
                case 2 : {
                    System.out.println("How many students do you want to add? ");
                    int q = scn.nextInt();
                    int id;
                    String name, surname, group;
                    ArrayList<Student> students = new ArrayList<>();
                    while (q > 0) {
                        System.out.println("Enter information about student: ");
                        System.out.println("Enter student's id: ");
                        id = scn.nextInt();
                        System.out.println("Enter student's name: ");
                        name = scn.next();
                        System.out.println("Enter student's surname: ");
                        surname = scn.next();
                        System.out.println("Enter student's group: ");
                        group = scn.next();
                        students.add(new Student(id, name, surname, group, new ArrayList<>()));
                        q--;
                    }
                    library.setStudents(students);
                    System.out.println("You added students!");
                    break;
                }
                case 3 : {
                    System.out.println("This is list of all Students: ");
                    library.listStudents();
                    System.out.println("Choose one of them: ");
                    int index = scn.nextInt();
                    System.out.println("This is list of all Books: ");
                    library.listBooks();
                    System.out.println("What book do you want to assign to the student?");
                    int num = scn.nextInt();
                    library.getStudents().get(index - 1).addBookToStudent(library.getAllbooks().get(num - 1));
                    System.out.println("You assigned book to the student!");
                    break;
                }
                case 4 : {
                    System.out.println("This is list of all Students: ");
                    library.listStudents();
                    System.out.println("Choose one of them: ");
                    int index = scn.nextInt();
                    System.out.println("This is list of students books: ");
                    library.getStudents().get(index - 1).studentsBooks();
                    System.out.println("Choose the book you want to delete from student: ");
                    int num = scn.nextInt();
                    library.getStudents().get(index - 1).deleteBook(num - 1);
                    System.out.println("You delete the book from student!");
                    break;
                }
                case 5: {
                    System.out.println("This is list of all students: ");
                    library.listStudents();
                    System.out.println("This is list of all Books: ");
                    library.listBooks();
                    break;
                }
                case 6 : {
                    for (int i = 0; i < library.getStudents().size(); i++){
                        System.out.println("Student: " + library.getStudents().get(i) + "\nStudent's Books: " );
                        library.getStudents().get(i).studentsBooks();
                    }
                    break;
                }
            }
        }
    }
}
