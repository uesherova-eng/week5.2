package inheritance;
public class Vehicle2 {
    protected String make;
    protected String model;
    protected int year;
    protected String fuelType;
    public Vehicle2(String make,String model,int year, String fuelType){
        this.make=make;
        this.model=model;
        this.year=year;
        this.fuelType=fuelType;
    }
    public double calculateFuelEfficiency(){
        return 0;
    }
    public double calculateDistanceTraveled(double fuel,double efficiency){
        return fuel*efficiency;
    }
    public double getMaxSpeed(){
        return 0;
    }
    public void PrintInfo(){
        System.out.println("Make: "+make);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
        System.out.println("Fuel Type: "+fuelType);
    }
}
class Truck extends Vehicle2 {
        private double cargoCapacity;

        public Truck(String make, String model, int year, String fuelType, double cargoCapacity) {
            super(make, model, year, fuelType);
            this.cargoCapacity = cargoCapacity;
        }
        public double calculateFuelEfficiency() {
            return 8;
        }
        public double getMaxSpeed() {
            return 120;
        }
        public double getCargoCapacity() {
            return cargoCapacity;
        }
    }
class Car2 extends Vehicle2 {
    private int numDoors;

    public Car2(String make, String model, int year, String fuelType, int numDoors) {
        super(make, model, year, fuelType);
        this.numDoors = numDoors;
    }
    public double calculateFuelEfficiency() {
        return 15;
    }
    public double getMaxSpeed() {
        return 180;
    }
}
class Motorcycle extends Vehicle2 {
    private boolean hasSidecar;
    public Motorcycle(String make, String model, int year, String fuelType, boolean hasSidecar) {
        super(make, model, year, fuelType);
        this.hasSidecar = hasSidecar;
    }

    public double calculateFuelEfficiency() {
        return 25;
    }

    public double getMaxSpeed() {
        return 200;

    }
}