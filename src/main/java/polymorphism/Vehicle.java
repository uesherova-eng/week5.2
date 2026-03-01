package polymorphism;

public class Vehicle {
    protected int speed;

    public void speeddUp(){
        speed +=5;
        System.out.println("Vehicle speed increased to: " + speed);
    }
}
class Car extends Vehicle{
    public void speedUp(){
        speed +=20;
        System.out.println("Car speed increased to: " + speed);
    }
}
class Bicycle extends Vehicle{
    public void speedUp(){
        speed +=2;
        System.out.println("Bicycle speed increased to: " + speed);

    }
}