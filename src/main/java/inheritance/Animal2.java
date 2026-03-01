package inheritance;

public class Animal2 {
    public void move(){
        System.out.println("Animal moves");
    }

}
class Cheetah extends Animal2{
    public void move(){
        System.out.println("Run");
    }
}