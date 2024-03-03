package POO3.Figure2D;

public class Rectangle extends Figure2D {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return "Rectangle: Length = " + length + ", Width = " + width + ", Area = " + area() + ", Perimeter = " + perimeter();
    }
}
