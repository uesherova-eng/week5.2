package encapsulation;

public class Book {
    private String title;
    private String author;
    private double price;

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            price = price - (price * percentage / 100);
            System.out.println("Discount : " + percentage + "%");
        } else {
            System.out.println("Invalid ");
        }
    }
}
