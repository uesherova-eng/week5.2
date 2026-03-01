package constructor;

public class Classroom {
    String className;
    String[] students;

    public Classroom(String className,String[]strudents){
        this.className=className;
        this.students=strudents;

    }
    public void printInfo(){
        System.out.println("Class name: "+className);
        System.out.println("Students: ");
        for (int i = 0; i <students.length ; i++) {
            System.out.println((i+1)+") "+students[i]);

        }
    }
}
