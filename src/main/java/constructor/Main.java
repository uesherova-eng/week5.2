package constructor;
public class Main {
    public static void main(String[] args) {
        System.out.println("1 Default Constructor");
        Cat cat=new Cat();
        //cat.printInfo();
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println();

        System.out.println("2 Parametrized Constructor");
        Dog dog=new Dog("red","Kola");
        System.out.println("Color: "+dog.getColor());
        System.out.println("Name: "+dog.getName());
        System.out.println();

        System.out.println("3 Constructor Overloading");
        Book book=new Book();
        Book book1=new Book("aa","dcdds");

        Book book2=new Book("cd","ccd",3233);

        book.info();
        System.out.println();
        book1.info();
        System.out.println();
        book2.info();
        System.out.println();

        System.out.println("4 Chaining Constructors");
        Student student1=new Student();
        student1.info();
        System.out.println();

        Student student2=new Student(250107777,"Polka");
        student2.info();
        System.out.println();

        Student student3=new Student(250107004,"Baron",100);
        student3.info();

        System.out.println("5 Copy Constructor");
        System.out.println("Create original: ");
        Rectangle rectangle = new Rectangle(20.5, 5.5);
        rectangle.printInfo();
        System.out.println();

        System.out.println("Create copy: ");
        Rectangle copy=new Rectangle(rectangle);
        copy.printInfo();
        System.out.println();

        System.out.println("Change the original");
        rectangle.length = 10.0;
        rectangle.width = 4.0;
        System.out.println("Original after changing:");
        rectangle.printInfo();
        System.out.println();

        System.out.println("Copy not changed:");
        copy.printInfo();
        System.out.println();

        System.out.println("6 Constructor with Validation");
        Account account=new Account("250107004",1047000);
        account.printInfo();

        System.out.println();

        Account account1=new Account("",-323);
        account1.printInfo();
        System.out.println();

        Account account2=new Account(null,342);
        account2.printInfo();
        System.out.println();

        System.out.println("7 Constructor with default values");
        Car car1=new Car("Mers","AMG 63 gt",2018);
        car1.printInfo();
        System.out.println();

        Car car2=new Car();
        car2.printInfo();
        System.out.println();
        System.out.println("8-9 Constructor with Array Initialization");
        String[]studentsList={"Umida","Meerim","Bael","Nurel"};
        Classroom classroom=new Classroom("IEMIT-25",studentsList);
        classroom.printInfo();





    }
}