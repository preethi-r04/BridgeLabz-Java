package dsa.linkedlist;
public class InventoryManagementSystem {

    class Node {
        int itemId;
        String itemName;
        int quantity;
        double price;
        Node next;

        Node(int id, String name, int q, double p) {
            itemId = id;
            itemName = name;
            quantity = q;
            price = p;
        }
    }

    Node head;

    void addItem(int id, String name, int q, double p) {
        Node n = new Node(id, name, q, p);
        if (head == null) {
            head = n;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = n;
        }
    }

    void removeItem(int id) {
        Node curr = head, prev = null;
        while (curr != null) {
            if (curr.itemId == id) {
                if (prev == null)
                    head = curr.next;
                else
                    prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    void updateQuantity(int id, int q) {
        Node temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = q;
                return;
            }
            temp = temp.next;
        }
    }

    void searchById(int id) {
        Node temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                System.out.println(
                        temp.itemId + " " +
                                temp.itemName + " " +
                                temp.quantity + " " +
                                temp.price
                );
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    void searchByName(String name) {
        Node temp = head;
        while (temp != null) {
            if (temp.itemName.equals(name)) {
                System.out.println(
                        temp.itemId + " " +
                                temp.itemName + " " +
                                temp.quantity + " " +
                                temp.price
                );
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    void totalInventoryValue() {
        double sum = 0;
        Node temp = head;
        while (temp != null) {
            sum += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Value: " + sum);
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(
                    temp.itemId + " " +
                            temp.itemName + " " +
                            temp.quantity + " " +
                            temp.price
            );
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem i = new InventoryManagementSystem();

        i.addItem(101, "Laptop", 2, 50000);
        i.addItem(102, "Mouse", 5, 500);
        i.addItem(103, "Keyboard", 3, 1500);

        i.display();

        i.updateQuantity(102, 10);
        i.searchById(102);

        i.totalInventoryValue();

        i.removeItem(101);
        i.display();
    }
}
