package constructor;

public class Student {

    int studentId;
    String studentName;
    int grade;

    public Student(int studentId,String studentName,int grade){

        this.studentId=studentId;
        this.studentName=studentName;
        this.grade=grade;
    }
    public Student(int studentId,String studentName){
        this(studentId,studentName,0);

    }
    public Student(){
        this(0,"Unknown",0);
    }
    public void info(){
        System.out.println("Student ID : " + studentId);
        System.out.println("Student name: " + studentName);
        System.out.println("Grade: " + grade);

    }
}
