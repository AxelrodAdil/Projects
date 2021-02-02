package OOP_Java.Shape_Square;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){}

    public Rectangle(String color, boolean filled, double width_main, double length_main){
        super(color, filled);
        this.width = width_main;
        this.length = length_main;
    }

    public double getWidth(){ return width; }
    public double getLength(){ return length; }
}
