package CoreProgramming.ClassObject.Level1;

class BookDetails{
    private String title;
    private String author;
    private double price;

    public BookDetails(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;

    }
    public void displayDetails(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }

}
public class Book {
    public static void main(String[] args) {
        BookDetails b1 = new BookDetails("Love","ABC",123.0);
        b1.displayDetails();
        
    }
    
}
