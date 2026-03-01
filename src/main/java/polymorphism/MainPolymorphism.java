package polymorphism;

public class MainPolymorphism {
    public static void main(String[] args) {

        System.out.println(1);
        Animal animal=new Bird();
        Animal animal1=new Cat();
        animal.Sound();
        animal1.Sound();

        System.out.println(2);
        Vehicle car=new Car();
        Vehicle bicycle=new Bicycle();
        car.speeddUp();
        bicycle.speeddUp();

        System.out.println(3);
        Shape circle=new Circle(5);
        Shape rectangle=new Rectangle(10,5);
        Shape triangle=new Triangle(8,4);
        System.out.println("Circle area: " +circle.calculateArea());
        System.out.println("Rectangle area: "+rectangle.calculateArea());
        System.out.println("Triangle area: "+triangle.calculateArea());


        System.out.println(4);
        Employee manager=new Manager("Salami",35000);
        Employee programmer=new Programmer("Venera",55000);
        System.out.println("Manager salary: "+manager.calculateSalary());
        System.out.println("Programmer salary: "+programmer.calculateSalary());


        System.out.println(5);
        Sports football=new Football();
        Sports basketball=new Basketball();
        Sports rugby=new Rugby();

        football.play();
        basketball.play();
        rugby.play();


        System.out.println(6);
        Shape2 circle2 = new Circle2(5);
        Shape2 rectangle2 = new Rectangle2(10, 5);
        Shape2 triangle2 = new Triangle2(3, 4, 5);

        System.out.println("Circle - Area: " + circle2.getArea() + ", Perimeter: " + circle2.getPerimeter());
        System.out.println("Rectangle - Area: " + rectangle2.getArea() + ", Perimeter: " + rectangle2.getPerimeter());
        System.out.println("Triangle - Area: " + triangle2.getArea() + ", Perimeter: " + triangle2.getPerimeter());

        System.out.println(7);
        Animal2 bird=new Bird2();
        Animal2 panther =new Panther();

        bird.move();
        panther.move();
        bird.makeSound();
        panther.makeSound();

        System.out.println(8);
        Shape3 cir=new Circle3(5);
        Shape3 square=new Square(4);
        Shape3 trian=new Triangle3(6,3);
        cir.draw();
        System.out.println("Area: " + circle.calculateArea());

        square.draw();
        System.out.println("Area: " + square.calculateArea());

        trian.draw();
        System.out.println("Area: " + triangle.calculateArea());

        System.out.println(9);
        SavingsAccount savings = new SavingsAccount(1000);
        CheckingAccount checking = new CheckingAccount(1000);

        savings.withdraw(100);
        savings.withdraw(100);
        savings.withdraw(100);
        savings.withdraw(100);

        checking.withdraw(100);
        checking.withdraw(100);


        System.out.println(10);
        Animal4 lion = new Lion();
        Animal4 tiger = new Tiger();
        Animal4 panther4 = new Panther4();

        lion.eat();
        lion.sound();

        tiger.eat();
        tiger.sound();

        panther4.eat();
        panther4.sound();



        System.out.println(11);
        Vehicle2 car2 = new Car2();
        Vehicle2 bike = new Motorcycle();

        car2.startEngine();
        car2.stopEngine();

        bike.startEngine();
        bike.stopEngine();

        System.out.println(12);

        Shape4 circle4 = new Circle4(5);
        Shape4 cylinder = new Cylinder(5, 10);

        circle4.draw();
        System.out.println("Circle area: " + circle4.calculateArea());

        cylinder.draw();
        System.out.println("Cylinder surface area: " + cylinder.calculateArea());


    }
}
