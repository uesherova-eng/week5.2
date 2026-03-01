package polymorphism;

public class Animal {

    public void Sound(){
        System.out.println("Animal makes a sound");

    }
}
class Bird extends Animal{
    public void Sound(){
        System.out.println("Bird chirps");
    }
}
class Cat extends Animal{
    @Override
    public void Sound() {
        System.out.println("Cat meows");
    }
}