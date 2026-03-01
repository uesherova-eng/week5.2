package polymorphism;

public class Animal2 {
    public void move(){
        System.out.println("Animal moves");
    }
    public void makeSound(){
        System.out.println("Animal makes sound");
    }

}
class Bird2 extends Animal2{
    public void move(){
        System.out.println("Birds flies");
    }
    public void makeSound(){
        System.out.println("Bird chirps");
    }

}
class Panther extends Animal2{
    public void move(){
        System.out.println("Panther runs");
    }
    public void makeSound(){
        System.out.println("Panther roars");
    }
}