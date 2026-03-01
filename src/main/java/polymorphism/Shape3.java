package polymorphism;
public class Shape3 {
    public void draw(){
        System.out.println("Drawing a shape");
    }
    public double calculateArea(){
        return 0;
    }
}
class Circle3 extends Shape3{
    private double radius;
    public Circle3(double radius){
        this.radius=radius;
    }
    public void draw() {
        System.out.println("Drawing a circle");
    }
    public double calculateArea() {
        return Math.PI*radius*radius;
    }
}
class Square extends Shape3{
    private double side;
    public Square(double side){
        this.side=side;
    }
    public void draw(){
        System.out.println("Drawing a square");
    }
    public double calculateArea(){
        return side*side;
    }
}
class Triangle3 extends Shape3{
    private double base;
    private double height;

    public Triangle3(double base, double height){
        this.base=base;
        this.height=height;
    }
    public void draw(){
        System.out.println("drawing triangle");
    }

    public double calculateArea() {
        return 0.5*base*height;
    }
}
