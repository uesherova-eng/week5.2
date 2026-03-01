package encapsulation;

public class Desktop {
    private String brand;
    private String processor;
    private int ramSize;
    public String getBrand(){
        return brand;
    }
    public String getProcessor() {
        return processor;
    }
    public int getRamSize() {
        return ramSize;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }
    public void upgradeRam(int value){
        if(value>0){
            ramSize+=value;
            System.out.println("RAM upgraded by "+value+"GB");
        }else{
            System.out.println("Invalid");

        }
    }
}
