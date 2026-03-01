package constructor;

public class Cat {
  private  String name;
   private int age;

   public  Cat(){
       this.name="Unknown";
       this.age=0;
    }
    public void printInfo(){
        System.out.println(name+" , "+age);
    }
    public String getName(){

       return name;
    }
    public int getAge(){

       return age;
    }


}