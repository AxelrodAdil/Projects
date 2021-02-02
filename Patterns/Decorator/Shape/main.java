package Patterns.Decorator.Shape;

import Patterns.Decorator.Shape.shapes_.Circle;
import Patterns.Decorator.Shape.shapes_.Rectangle;
import Patterns.Decorator.Shape.shapes_.RedShapeDecorator;

public class main {
    public static void main(String[] args) {

        Shape circle_main = new Circle();

        Shape another_Circle = new RedShapeDecorator(new Circle());
        Shape another_Rectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle - main_path");
        circle_main.draw();

        System.out.println("\nCircle - Another_path");
        another_Circle.draw();

        System.out.println("\nRectangle - Another_path");
        another_Rectangle.draw();

    }
}
