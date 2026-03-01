package polymorphism;
public class Employee{
    protected String name;
    protected double salary;
    public Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    public double calculateSalary(){
        return salary;
    }
}
class Manager extends Employee{
    public Manager(String name,double salary){
        super(name,salary);
    }

    public double calculateSalary() {
        return salary +25000;
    }
}
class Programmer extends Employee{
    public Programmer(String name , double salary){
        super(name, salary);
    }

    public double calculateSalary() {
        return salary +10000002;
    }
}