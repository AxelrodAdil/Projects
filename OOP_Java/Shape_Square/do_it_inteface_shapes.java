package OOP_Java.Shape_Square;

import java.util.ArrayList;

public class do_it_inteface_shapes implements Interface_shapes {
    private ArrayList<Shape> products = new ArrayList<>();

    @Override
    public void addShapes(Shape shape) {
        products.add(shape);
    }

    @Override
    public void toStringThis(){
        for (Shape shape : products){
            if (shape instanceof Circle){
                System.out.println("Color: " + shape.getColor() + ", Filled: " + shape.isFilled() + ", Radius: " + ((Circle) shape).getRadius());
            }

            if (shape instanceof Rectangle && !(shape instanceof Square)){
                System.out.println("Color: " + shape.getColor() + ", Filled: " + shape.isFilled() + ", Width: " + ((Rectangle) shape).getWidth()
                        + ", Length: " + ((Rectangle) shape).getLength());
            }

            if (shape instanceof Square){
                if (((Square) shape).getWidth() == ((Square) shape).getLength()){     // side
                    System.out.println("Square --- Color: " + shape.getColor() + ", Filled: " + shape.isFilled() + ", Width: " + ((Rectangle) shape).getWidth()
                            + ", Length: " + ((Rectangle) shape).getLength());
                } else {
                    System.out.println("It isn't square!");
                }
            }
        }
    }

    @Override
    public void getArea() {
        double radius = 0;
        int n1 = 1;
        int n2 = 1;
        int n3 = 1;
        double[] arrayArea = new double[] {0, 0, 0};
        for (Shape shape : products){
            if (shape instanceof Circle){
                radius = ((Circle) shape).getRadius();
                arrayArea[0] = Math.PI * radius*radius;
                System.out.println("Area_Circle: [" + n1 + "] " + arrayArea[0]);
                n1++;
            }

            if (shape instanceof Rectangle && !(shape instanceof Square)){
                arrayArea[1] = ((Rectangle) shape).getLength() * ((Rectangle) shape).getWidth();
                System.out.println("Area_Rectangle: [" + n2 + "] " + arrayArea[1]);
                n2++;
            }

            if (shape instanceof Square){
                if (((Square) shape).getWidth() == ((Square) shape).getLength()){     // side
                    arrayArea[2] = ((Rectangle) shape).getLength() * ((Rectangle) shape).getWidth();
                    System.out.println("Area_Square: [" + n3 + "] " + arrayArea[2]);
                    n3++;
                } else {
                    System.out.println("It isn't square! [" + n3 + "]");
                    n3++;
                }
            }
        }
    }

    @Override
    public void getPerimeter(){
        double[] arrayArea = new double[] {0, 0, 0};
        int n1 = 1;
        int n2 = 1;
        int n3 = 1;
        for (Shape shape : products){
            if (shape instanceof Circle){
                arrayArea[0] = 2 * Math.PI * ((Circle) shape).getRadius();
                System.out.println("Perimeter_Circle: [" + n1 + "] " + arrayArea[0]);
                n1++;
            }

            if (shape instanceof Rectangle && !(shape instanceof Square)){
                arrayArea[1] = 2 * (((Rectangle) shape).getLength() + ((Rectangle) shape).getWidth());
                System.out.println("Perimeter_Rectangle: [" + n2 + "] " + arrayArea[1]);
                n2++;
            }

            if (shape instanceof Square){
                if (((Square) shape).getWidth() == ((Square) shape).getLength()){     // side
                    arrayArea[2] = 2 * (((Rectangle) shape).getLength() + ((Rectangle) shape).getWidth());
                    System.out.println("Perimeter_Square: [" + n3 + "] " + arrayArea[2]);
                    n3++;
                } else {
                    System.out.println("It isn't square! [" + n3 + "]");
                    n3++;
                }
            }
        }
    }
}
