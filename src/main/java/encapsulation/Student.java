package encapsulation;
import java.util.ArrayList;
public class Student {
    private int student_id;
    private String student_name;
    private ArrayList<Integer>grades=new ArrayList<>();

    public int getStudent_id(){
        return student_id;
    }
    public void setStudent_id(int studentId){
        this.student_id=studentId;
    }
    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }
    public ArrayList<Integer>getGrades(){
        return grades;
    }
    public void addGrade(int grade){
        if(grade>=0 && grade <=100){
            grades.add(grade);
            System.out.println("Grade:  "+grade);
        }else{
            System.out.println("Invalid");
        }
    }
}
