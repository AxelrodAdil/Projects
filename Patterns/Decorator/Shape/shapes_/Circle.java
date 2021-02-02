package Patterns.Decorator.Shape.shapes_;

import Patterns.Decorator.Shape.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle.");
    }
}