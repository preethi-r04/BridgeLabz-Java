package oops.encapsulation;

interface Reservable {
    void reserveItem();
}

abstract class LibraryItem {
    private int itemId;
    private String title;

    LibraryItem(int id, String title) {
        itemId = id;
        this.title = title;
    }

    abstract int getLoanDuration();
}

class Book extends LibraryItem {
    Book(int id, String title) {
        super(id, title);
    }

    int getLoanDuration() {
        return 14;
    }
}
