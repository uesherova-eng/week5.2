package polymorphism;

public class Sports {

    public void play(){
        System.out.println("Playing sport");

    }
}
class Football extends Sports{
    public void play(){
        System.out.println("Playing football");
    }


}
class Basketball extends Sports{
    public void play(){
        System.out.println("Playing basketball");
    }

}
class Rugby extends Sports{

    public void play(){
        System.out.println("Playing rugby");
    }
}