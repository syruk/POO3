package POO3.Figure2D;

public class Square extends Figure2D {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double area() {
        return side * side;
    }

    public double perimeter() {
        return 4 * side;
    }

    public String toString() {
        return "Square: Side = " + side + ", Area = " + area() + ", Perimeter = " + perimeter();
    }
}