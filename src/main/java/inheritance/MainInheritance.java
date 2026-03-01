package inheritance;

public class MainInheritance {
    public static void main(String[] args) {
        System.out.println(1);
        Animal animal=new Animal();
        Cat cat=new Cat();

        animal.makeSound();
        cat.makeSound();

        System.out.println(2);
        Vehicle vehicle=new Vehicle();
        Car car=new Car();

        vehicle.drive();
        car.drive();


        System.out.println(3);
        Rectangle rectangle=new Rectangle(20,10);
        System.out.println("Area of rectangle: "+rectangle.getArea());

        System.out.println(4);
        HRManager hr=new HRManager();
        hr.work();
        System.out.println("Salary: "+hr.getSalary());
        hr.addEmployee();

        System.out.println(5);
        SavingAccount savings=new SavingAccount(500);
        System.out.println("Balance: " + savings.getBalance());
        savings.withdraw(450);
        savings.withdraw(300);
        System.out.println("Balance: " + savings.getBalance());

        System.out.println(6);
        Animal2 animal1=new Animal2();
        Cheetah cheetah=new Cheetah();
        animal1.move();
        cheetah.move();


        System.out.println(7);
        Employee2 employee=new Employee2("Patriot","Kuchin",10109,"Manager");

        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name: " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());

        System.out.println(8);
        Circle circle=new Circle(3);

        System.out.println("Circle Radius: 3");
        System.out.println("Perimeter : "+circle.getPerimeter());
        System.out.println("Area: "+circle.getArea());


        System.out.println(9);

        Truck truck=new Truck("Ford","Maverick",2004,"Gaz",5.5);
        Car2 car2=new Car2("Mers","Benz",1993,"Diesel",3);
        Motorcycle bike = new Motorcycle("Harley", "Sport", 2021, "Gasoline", false);

        System.out.println("=== TRUCK ===");
        truck.PrintInfo();
        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " km/l");
        System.out.println("Max Speed: " + truck.getMaxSpeed() + " km/h");

        System.out.println("=== CAR ===");
        car2.PrintInfo();
        System.out.println("Fuel Efficiency: " + car2.calculateFuelEfficiency() + " km/l");
        System.out.println("Max Speed: " + car2.getMaxSpeed() + " km/h");

        System.out.println("=== MOTORCYCLE ===");
        bike.PrintInfo();
        System.out.println("Fuel Efficiency: " + bike.calculateFuelEfficiency() + " km/l");
        System.out.println("Max Speed: " + bike.getMaxSpeed() + " km/h");

        System.out.println(10);
        Manager manager = new Manager("Alice", "123 Main St2", 90000, "Manager");
        Developer dev = new Developer("Bob", "456 Frunze ", 75000, "Developer");
        Programmer prog = new Programmer("Charlie", "789 Pine Rd", 800000, "Programmer");

        System.out.println("=== MANAGER ===");
        System.out.println("Bonus: " + manager.calculateBonus());
        System.out.println(manager.generatePerformanceReport());
        manager.manageProject();

        System.out.println("=== DEVELOPER ===");
        System.out.println("Bonus: " + dev.calculateBonus());
        System.out.println(dev.generatePerformanceReport());
        dev.manageProject();

        System.out.println("=== PROGRAMMER ===");
        System.out.println("Bonus: " + prog.calculateBonus());
        System.out.println(prog.generatePerformanceReport());
        prog.manageProject();


    }
}
