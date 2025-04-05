package lectorials.week05;

public class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double computeArea(){
        return this.radius * this.radius * Math.PI;
    }
}
