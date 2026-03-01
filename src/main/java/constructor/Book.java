package constructor;

public class Book {
   private String title;
   private String author;
   private int price;

   public Book(){
       this.title="Unknown";
       this.author="Unknown";
       this.price=0;
   }
   public Book(String author,String title) {
      this.author = author;
      this.title = title;
      this.price = 0;
  }
   public Book(String author,String title,int price){
        this.author=author;
        this.title=title;
        this.price=price;
    }
    public String getTitle(){
       return title;
    }
    public String getAuthor(){
       return author;
    }
    public int getPrice(){
       return price;
    }
    public void info(){
       System.out.println("Author: "+author);
       System.out.println("Title: "+title);
       System.out.println("Price: "+price);
    }
}
