package Oops.static_this_final;

class Book {

    static String libraryName = "Central Library";

    final String isbn;
    String title;
    String author;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    void displayDetails(Object obj) {
        if (obj instanceof Book) {
            Book b = (Book) obj;
            System.out.println("Title: " + b.title);
            System.out.println("Author: " + b.author);
            System.out.println("ISBN: " + b.isbn);
        }
    }

    public static void main(String[] args) {
        Book book = new Book("Java Basics", "James", "ISBN123");
        Book.displayLibraryName();
        book.displayDetails(book);
    }
}
