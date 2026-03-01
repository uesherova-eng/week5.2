package constructor;

public class Rectangle {
    double length;
    double width;

    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;

    }
    public Rectangle(Rectangle other){
        this.length=other.length;
        this.width=other.width;
    }
    public void printInfo(){
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
}
