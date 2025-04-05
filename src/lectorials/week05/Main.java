package lectorials.week05;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void printAreaOfShape(Shape s){
        System.out.println(s.computeArea());
    }


    public static void main(String[] args) {
        // This will give you error
//        Shape myShape = new Shape();
        // Initializng a shape as a circle with radius
        Shape myShape = new Circle(5.0);
        Shape myShape2 = new Square(10.0, 5.0);

        printAreaOfShape(myShape);
        printAreaOfShape(myShape2);

//        RandomShape r = new RandomShape();
//        printAreaOfShape(r);
        Square mySquare = new Square(5.0, 5.0);
        mySquare.print();

        Printable printable = new Square(1.0, 10.0);
        // These do not work
//        Printable printable2 = new Circle(5.0);
//        Printable printable3 = new Printable();

    }
}
