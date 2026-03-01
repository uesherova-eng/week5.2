package encapsulation;
public class House {
    private String address;
    private int numberOfRooms;
    private double area;
    public String getAddress(){
        return address;
    }
    public int getNumberOfRooms(){
        return numberOfRooms;
    }

    public double getArea() {
        return area;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void setArea(double area) {
        this.area = area;
    }
    public double calculatePrice(double pricePerSquareMeter){
        return area*pricePerSquareMeter;
    }
}
