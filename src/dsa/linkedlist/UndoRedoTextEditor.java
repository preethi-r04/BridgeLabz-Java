package dsa.linkedlist;

public class UndoRedoTextEditor {

    class Node {
        String text;
        Node prev, next;

        Node(String t) {
            text = t;
        }
    }

    Node head, current;
    int size = 0;
    int limit = 10;

    void addState(String text) {
        Node n = new Node(text);

        if (head == null) {
            head = current = n;
        } else {
            current.next = n;
            n.prev = current;
            current = n;
        }

        size++;

        if (size > limit) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    void undo() {
        if (current != null && current.prev != null)
            current = current.prev;

        System.out.println("Current Text: " + current.text);
    }

    void redo() {
        if (current != null && current.next != null)
            current = current.next;

        System.out.println("Current Text: " + current.text);
    }

    void showCurrent() {
        if (current != null)
            System.out.println("Current Text: " + current.text);
    }

    public static void main(String[] args) {
        UndoRedoTextEditor e = new UndoRedoTextEditor();

        e.addState("Hello");
        e.addState("Hello World");
        e.addState("Hello World!!!");

        e.showCurrent();
        e.undo();
        e.undo();
        e.redo();
    }
}
