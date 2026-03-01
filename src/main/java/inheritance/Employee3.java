package inheritance;

public class Employee3 {
    protected String name;
    protected String address;
    protected double salary;
    protected String job;

    public Employee3(String name,String address,double salary, String job) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.job = job;
    }
        public double calculateBonus() {
            return salary * 0.05;
        }

        public String generatePerformanceReport() {
            return "Performance report for " + name + ": Good";
        }

        public void manageProject() {
            System.out.println(name + " is managing a project");

    }

}
class Manager extends Employee3{
    public Manager(String name,String address, double salary,String job){
        super(name,address,salary,job);
    }

    @Override
    public double calculateBonus() {
        return salary*0.15;
    }
    public String generateYourReport(){
        return "Manager "+name+" : Exellent";

    }
    public void manageProgect(){
        System.out.println(name+" is managing a lot of projects");

    }
}
class Developer extends Employee3{
    public Developer(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    public double calculateBonus() {
        return salary * 0.10;
    }

    public String generatePerformanceReport() {
        return "Developer " + name + ": Very Good";
    }

    public void manageProject() {
        System.out.println(name + " is developing a project");
    }
}
class Programmer extends Employee3 {
    public Programmer(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    public double calculateBonus() {
        return salary * 0.12;
    }

    public String generatePerformanceReport() {
        return "Programmer " + name + ": Outstanding";
    }

    public void manageProject() {
        System.out.println(name + " is coding the project");
    }
}