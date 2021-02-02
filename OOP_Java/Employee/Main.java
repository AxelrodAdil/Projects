package OOP_Java.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /**
     * freelancer,Adrey,Andreev,27,designer,40,10000;
     * fulltime,Roman,Abramovich,35,productManager;
     * freelancer,Arman,Bergov,29,teacher,25,2500;
     * fulltime,Adlet,Tokyshev,37,developer;
     * freelancer,Steve,Rogers,35,teamLead,50,12000;
     */

    /*
    Functional Requirements:
CRUD
− CREATE - create objects of Classes -> add to arrayLists-->write to txt files: «FullTimeEmployees.txt», «PartTimeEmployee.txt»;
− READ – (Show all Employees) read from txt files: «FullTimeEmployees.txt», «PartTimeEmployee.txt»;
− UPDATE (Read from NewEmployees.txt -> create a new employees objects using information provided in that (NewEmployees.txt) external txt file, rewrites txt files);
− DELETE (Delete specific employee via contractID from arrayList, rewrites txt files)
Test all functions of your program in Main.java
    */

    public static final Scanner sc = new Scanner(System.in);
    public static ArrayList<Employee> main_arraylist = new ArrayList<>();

    public static void main(String[] args) {
        IFile interface_main = new do_it_IFile();
        interface_main.add();

        interface_main.read();
    }

}
