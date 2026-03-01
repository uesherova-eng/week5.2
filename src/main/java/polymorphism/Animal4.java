package polymorphism;

public class Animal4 {
    public void eat() {
        System.out.println("Animal eats");
    }

    public void sound() {
        System.out.println("Animal makes sound");
    }
}
class Lion extends Animal4 {

    public void eat() {
        System.out.println("Lion eats meat");
    }
    public void sound() {
        System.out.println("Lion roars");
    }
}
class Tiger extends Animal4 {
    public void eat() {
        System.out.println("Tiger eats deer");
    }
    public void sound() {
        System.out.println("Tiger growls");
    }
}

class Panther4 extends Animal4 {

    public void eat() {
        System.out.println("Panther eats small animals");
    }
    public void sound() {
        System.out.println("Panther hisses");
    }
}
