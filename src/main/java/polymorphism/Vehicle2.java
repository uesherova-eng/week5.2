package polymorphism;
public class Vehicle2 {
    protected boolean engineRunning;
    public void startEngine(){
        engineRunning=true;
        System.out.println("Vehicle engine started");
    }
    public void stopEngine(){
        engineRunning=false;
        System.out.println("Vehicle engine stopped");
    }
}
class Car2 extends Vehicle2 {
    public void startEngine() {
        engineRunning = true;
        System.out.println("Car engine started with key turn");
    }
    public void stopEngine() {
        engineRunning = false;
        System.out.println("Car engine stopped by pressing button");
    }
}

class Motorcycle extends Vehicle2 {
    public void startEngine() {
        engineRunning = true;
        System.out.println("Motorcycle engine started with kick start");
    }
        public void stopEngine() {
            engineRunning = false;
            System.out.println("Motorcycle engine stopped by kill switch");
        }
    }
