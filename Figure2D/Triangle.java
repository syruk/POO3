package POO3.Figure2D;

public class Triangle extends Figure2D {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double area() {
        return (base * height) / 2;
    }

    public double perimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "Triangle: Base = " + base + ", Height = " + height + ", Area = " + area() + ", Perimeter = " + perimeter();
    }
}