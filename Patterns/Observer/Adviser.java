package Patterns.Observer;

public class Adviser {
    /**
     *
     * Created by Adil Myktybek
     * on 30.11.2020, 13:55
     *
     */
    public static void main(String[] args) {
        Student student = new Student();
        new Plan(student);

        System.out.println("First state change: ...");
        student.setState("Having or showing behavior that is respectful and considerate of other people.");
        System.out.println("Second state change: ...");
        student.setState("You are welcome!!!");
    }
}