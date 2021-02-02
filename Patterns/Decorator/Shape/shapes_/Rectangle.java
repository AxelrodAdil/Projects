package Patterns.Decorator.Shape.shapes_;

import Patterns.Decorator.Shape.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle.");
    }
}