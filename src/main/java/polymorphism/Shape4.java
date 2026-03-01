package polymorphism;
public class Shape4 {
    public void draw() {
        System.out.println("Drawing a shape");
    }
    public double calculateArea() {
        return 0;
    }
}
class Circle4 extends Shape4 {
    private double radius;

    public Circle4(double radius) {
        this.radius = radius;
    }
    public void draw() {
        System.out.println("Drawing a circle");
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class Cylinder extends Shape4 {
    private double radius;
    private double height;
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void draw() {
        System.out.println("Drawing a cylinder");
    }
    public double calculateArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }
}



