package dsa.linkedlist;

public class LibraryManagementSystem {

    class Node {
        int bookId;
        String title;
        String author;
        String genre;
        boolean available;
        Node prev, next;

        Node(int id, String t, String a, String g, boolean av) {
            bookId = id;
            title = t;
            author = a;
            genre = g;
            available = av;
        }
    }

    Node head, tail;

    void addFirst(int id, String t, String a, String g, boolean av) {
        Node n = new Node(id, t, a, g, av);
        if (head == null) {
            head = tail = n;
        } else {
            n.next = head;
            head.prev = n;
            head = n;
        }
    }

    void addLast(int id, String t, String a, String g, boolean av) {
        Node n = new Node(id, t, a, g, av);
        if (tail == null) {
            head = tail = n;
        } else {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
    }

    void removeById(int id) {
        Node temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                if (temp == head)
                    head = temp.next;
                if (temp == tail)
                    tail = temp.prev;
                if (temp.prev != null)
                    temp.prev.next = temp.next;
                if (temp.next != null)
                    temp.next.prev = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    void searchByTitle(String t) {
        Node temp = head;
        while (temp != null) {
            if (temp.title.equals(t)) {
                System.out.println(temp.bookId + " " + temp.title + " " + temp.author);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    void updateAvailability(int id, boolean av) {
        Node temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                temp.available = av;
                return;
            }
            temp = temp.next;
        }
    }

    void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.println(
                    temp.bookId + " " +
                            temp.title + " " +
                            temp.author + " " +
                            temp.genre + " " +
                            temp.available
            );
            temp = temp.next;
        }
    }

    void displayReverse() {
        Node temp = tail;
        while (temp != null) {
            System.out.println(
                    temp.bookId + " " +
                            temp.title + " " +
                            temp.author + " " +
                            temp.genre + " " +
                            temp.available
            );
            temp = temp.prev;
        }
    }

    int countBooks() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        LibraryManagementSystem l = new LibraryManagementSystem();

        l.addFirst(1, "Java", "James", "Programming", true);
        l.addLast(2, "Python", "Guido", "Programming", true);
        l.addLast(3, "DBMS", "Korth", "Database", false);

        l.displayForward();
        System.out.println("Total Books: " + l.countBooks());

        l.updateAvailability(3, true);
        l.searchByTitle("DBMS");

        l.displayReverse();
    }
}


