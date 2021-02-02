package OOP_Java.Shape_Square;

public class Circle extends Shape{
    private double radius;

    public Circle(){}

    public Circle (String color, boolean filled, double radius_main){
        super(color, filled);
        this.radius = radius_main;
    }

    public double getRadius() { return radius; }
}
