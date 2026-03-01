package inheritance;

public class Animal {
    public void makeSound(){
        System.out.println("Animal makes a sound");
    }
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("Bark");

    }
}
