package lectorials.week05;

public class Square extends Shape implements Printable, Movable {
    private double length;
    private double width;
    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double computeArea(){
        return this.length * this.width;
    }

    public void print(){
        System.out.println("===Square===\n" + "Length: " + this.length + "\nWidth: " + this.width);
    }
}
