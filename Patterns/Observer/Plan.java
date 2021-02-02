package Patterns.Observer;

public class Plan extends Observer{
    /**
     *
     * Created by Adil Myktybek
     * on 30.11.2020, 13:55
     *
     */
    public Plan(Student student){
        this.student = student;
        this.student.attach(this);
    }

    @Override
    public void update() { // having or showing behavior that is respectful and considerate of other people.
        System.out.println( "You have to be polite! " + student.getState());
    }
}