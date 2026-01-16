package CoreProgramming.AccessModifiers;
class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends Book {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void display() {
        System.out.println(ISBN);
        System.out.println(title);
    }
}

public class LibApp {
    public static void main(String[] args) {
        EBook b1 = new EBook("ISBN101", "Java", "James");
        b1.display();
    }
}
