package inheritance;

public class Employee {
    public void work(){
        System.out.println("Employee is working");

    }
    public double getSalary(){
        return 10000;
    }
}
class HRManager extends Employee{
    public void work(){
        System.out.println("HR Manager is managing human resources");
    }
    public void addEmployee(){
        System.out.println("Adding new employee");
    }
}
