package Patterns.Decorator.Shape.shapes_;

import Patterns.Decorator.Shape.Shape;
import Patterns.Decorator.Shape.ShapeDecorator;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(final Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.decoratedShape.draw();
        this.setRedBorder(decoratedShape);
    }

    private void setRedBorder(final Shape decoratedShape) {
        System.out.println("We are here: " + decoratedShape);
        System.out.println("Another path!");
    }
}