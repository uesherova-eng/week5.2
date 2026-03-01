package encapsulation;
public class MainEncapsulation {
    public static void main(String[] args) {
        System.out.println(1);
        Person person=new Person();
        person.setName("Nurel");
        person.setAge(57);
        person.setCountry("Brazil");
        System.out.println("Name: "+person.getName());
        System.out.println("Age:  "+person.getAge());
        System.out.println("Country: "+person.getCountry());
        System.out.println();

        System.out.println(2);
        BankAccount account=new BankAccount();
        account.setAccountNumber("MKK5483745");
        account.setBalance(1839.42);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
        System.out.println();

        System.out.println(3);
        Rectangle rectangle=new Rectangle();
        rectangle.setLength(10.5);
        rectangle.setWidth(2.4);

        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println();

        System.out.println(4);
        Employee employee = new Employee();

        employee.setEmployee_id(2016);
        employee.setEmployee_name("Nurel Esherov");
        employee.setEmployee_salary(10.0);

        System.out.println("ID: " + employee.getEmployee_id());
        System.out.println("Name: " + employee.getEmployee_name());
        System.out.println("Salary: " + employee.getEmployee_salary());
        System.out.println();

        System.out.println(5);
        Circle circle=new Circle();
        circle.setRadius(3.2);


        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        System.out.println();

        System.out.println(6);
        Car car=new Car();

        car.setCompany_name("Mers");
        car.setModel_name("Benz");
        car.setYear(1993);
        car.setMileage(54.54);

        System.out.println("Company: " + car.getCompany_name());
        System.out.println("Model: " + car.getModel_name());
        System.out.println("Year: " + car.getYear());
        System.out.println("Mileage: " + car.getMileage());
        System.out.println();

        System.out.println(7);
        Student student=new Student();

        student.setStudent_id(434313);
        student.setStudent_name("Hero");

        student.addGrade(85);
        student.addGrade(89);
        student.addGrade(1045);

        System.out.println("ID: " + student.getStudent_id());
        System.out.println("Name: " + student.getStudent_name());
        System.out.println("Grades: " + student.getGrades());

        System.out.println();
        System.out.println(8);
        Book book=new Book();
        book.setTitle("Happiness");
        book.setAuthor("Esher");
        book.setPrice(100000.0);

        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: $" + book.getPrice());

        book.applyDiscount(10);
        System.out.println("Price after discount: "+book.getPrice());

        System.out.println();
        System.out.println(9);
        Smartphone phone=new Smartphone();

        phone.setBrand("Samsung");
        phone.setBrand("Galaxy S25 Ultra");
        phone.setStorageCapacity(256);
        phone.setModel("S24Ultra");

        System.out.println("Brand: " + phone.getBrand());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Storage: " + phone.getStorageCapacity() + "GB");

        phone.increaseStorage(128);
        System.out.println("New Storage: " + phone.getStorageCapacity() + "GB");

        System.out.println();
        System.out.println(10);

        Desktop desktop=new Desktop();

        desktop.setBrand("Samsung");
        desktop.setProcessor("Intel i7");
        desktop.setRamSize(12);
        System.out.println("Brand: " + desktop.getBrand());
        System.out.println("Processor: " + desktop.getProcessor());
        System.out.println("RAM: " + desktop.getRamSize() + "GB");

        desktop.upgradeRam(20);
        System.out.println("New RAM: " + desktop.getRamSize() + "GB");
        System.out.println();
        System.out.println(11);
        House house=new House();

        house.setAddress("Lenina 122A");
        house.setNumberOfRooms(5);
        house.setArea(300.0);
        System.out.println("Address: " + house.getAddress());
        System.out.println("Rooms: " + house.getNumberOfRooms());
        System.out.println("Area: " + house.getArea() + " sqm");
        System.out.println("Price: " + house.calculatePrice(2500));
        System.out.println();

        System.out.println(12);

        Account account1=new Account();
        account1.setAccountNumber("MKK123");
        account1.setAccountHolder("Esher Kadyraly");
        account1.setBalance(1000);

        System.out.println("Account: " + account1.getAccountNumber());
        System.out.println("Holder: " + account1.getAccountHolder());
        System.out.println("Balance: $" + account1.getBalance());

        account1.deposit(500);
        System.out.println("Balance after deposit: " + account.getBalance());

        account1.withdraw(200);
        System.out.println("Balance after withdrawal: " + account.getBalance());
        System.out.println();

        System.out.println(13);
        Movie movie=new Movie();
        movie.setTitle("Bunker");
        movie.setDirector("Andres Bais");
        movie.setDuration(143);

        System.out.println(movie.getMovieDetails());

        System.out.println();
        System.out.println(14);
        Product product=new Product();

        product.setProductName("Shampoo");
        product.setProductCode("NWA052");
        product.setPrice(1000.0);

        System.out.println("Product: " + product.getProductName());
        System.out.println("Code: " + product.getProductCode());
        System.out.println("Price: " + product.getPrice());

        product.applyDiscount(50);
        System.out.println("Price after discount: " + product.getPrice());


    }
}
