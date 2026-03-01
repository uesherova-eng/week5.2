package inheritance;

public class Vehicle {
    public void drive(){
        System.out.println("Driving a vehicle");

    }
}
class Car extends Vehicle{
    public void drive(){
        System.out.println("Repairing a car");
    }
}