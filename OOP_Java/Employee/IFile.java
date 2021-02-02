package OOP_Java.Employee;

import java.util.ArrayList;

public interface IFile {
    ArrayList<Employee> read();
    void write(ArrayList<Employee> employees);
    void update(ArrayList<Employee> employees);
    void add();
}
