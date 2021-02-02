package OOP_Java.Lab_13.L10;

public class Rectangle {
    private static Rectangle instance=new Rectangle();

    Rectangle(){}

    public static Rectangle getObject(){
        return instance;
    }

    public void print (){
        System.out.println("Singleton_rectangle");
    }
}
