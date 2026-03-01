package constructor;

public class Car {
    String make;
    String model;
    int year;


    public Car(String make,String model,int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }
    public Car(){
        this.make="Unknow";
        this.model="Unknown";
        this.year=0;
    }
    public void printInfo(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);

    }
}
