package CoreProgramming.Constructor;

class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed");
        } else {
            System.out.println("Book not available");
        }
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("Java", "James", 500);
        b1.borrowBook();
        b1.borrowBook();
    }
}

