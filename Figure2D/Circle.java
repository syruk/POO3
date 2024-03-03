package POO3.Figure2D;

public class Circle extends Figure2D {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    public double area() {
        return Math.PI * radius * radius;
    }


    public double perimeter() {
        return 2 * Math.PI * radius;
    }


    public String toString() {
        return "Circle: Radius = " + radius + ", Area = " + area() + ", Circumference = " + perimeter();
    }
}