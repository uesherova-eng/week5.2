package encapsulation;

public class Smartphone {
    private String brand;
    private String model;
    private int storageCapacity;

    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
    public void increaseStorage(int value){
        if(value>0){
            storageCapacity+=value;
            System.out.println("Storage increased by " + value + "GB");
        }else{
            System.out.println("Invalid increase value");
        }
    }
}
