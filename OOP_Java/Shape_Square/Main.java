package OOP_Java.Shape_Square;

import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Interface_shapes interface_shapes = new do_it_inteface_shapes();
        interface_shapes.addShapes(new Circle("Red", true, 2.0));
        interface_shapes.addShapes(new Circle("2-Red", false, 3.0));
        interface_shapes.addShapes(new Rectangle("Blue", true, 3.0, 5.0));
        interface_shapes.addShapes(new Square("Green", true, 2.0, 2.0));

        System.out.println("Begin\n");

        interface_shapes.toStringThis();
        System.out.println("------------------------------");
        interface_shapes.getArea();
        System.out.println("------------------------------");
        interface_shapes.getPerimeter();

        System.out.println("\nEND");
    }
}