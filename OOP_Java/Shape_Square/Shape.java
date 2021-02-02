package OOP_Java.Shape_Square;

public abstract class Shape {
    private String color;
    private boolean filled;

    public Shape(){}

    public Shape (String color_main, boolean filled_main){
        this.color = color_main;
        this.filled = filled_main;
    }

    public String getColor() { return color; }
    public boolean isFilled() { return filled; }
}