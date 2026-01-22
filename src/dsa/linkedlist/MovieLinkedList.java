package dsa.linkedlist;


public class MovieLinkedList {

    class Node {
        String title, director;
        int year;
        double rating;
        Node prev, next;

        Node(String t, String d, int y, double r) {
            title = t;
            director = d;
            year = y;
            rating = r;
        }
    }

    Node head, tail;

    void addFirst(String t, String d, int y, double r) {
        Node n = new Node(t, d, y, r);
        if (head == null) {
            head = tail = n;
        } else {
            n.next = head;
            head.prev = n;
            head = n;
        }
    }

    void addLast(String t, String d, int y, double r) {
        Node n = new Node(t, d, y, r);
        if (tail == null) {
            head = tail = n;
        } else {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.rating);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        MovieLinkedList m = new MovieLinkedList();
        m.addFirst("Inception", "Nolan", 2010, 9.0);
        m.addLast("Avatar", "Cameron", 2009, 8.5);
        m.display();
    }
}


