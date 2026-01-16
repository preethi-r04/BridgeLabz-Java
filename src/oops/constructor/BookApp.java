package CoreProgramming.Constructor;

class Book {
    private String title;
    private String author;
    private double price;

    
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class BookApp {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java", "James", 450);

        b1.displayDetails();
        b2.displayDetails();
    }
}
