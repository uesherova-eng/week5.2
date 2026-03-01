package constructor;

public class Dog {
    private String color;
    private String name;

    public Dog(String color,String name){
        this.color=color;
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }

}
