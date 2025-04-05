package lectorials.week05;

import java.util.ArrayList;

public class ShapeCollection {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5.0));
        shapes.add(new Square(10.0, 5.0));
        for(Shape shape: shapes){
            System.out.println(shape.computeArea());
        }


        shapes.remove(0);

    }
}
