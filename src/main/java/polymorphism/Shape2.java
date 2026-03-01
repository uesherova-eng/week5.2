package polymorphism;
public class Shape2 {
    public double getArea() {
        return 0;
    }
    public double getPerimeter() {
        return 0;
    }
}
class Circle2 extends Shape2 {
    private double radius;
    public Circle2(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
class Rectangle2 extends Shape2 {
    private double length;
    private double width;
    public Rectangle2(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return 2 * (length + width);
    }
}

class Triangle2 extends Shape2 {
    private double side1;
    private double side2;
    private double side3;
    public Triangle2(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {

        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}


