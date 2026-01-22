package dsa.stackqueueheap.hashing;


public class CustomHashMap {

    class Node {
        int key, value;
        Node next;
        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    int size = 10;
    Node[] table = new Node[size];

    int hash(int key) {
        return key % size;
    }

    void put(int key, int value) {
        int index = hash(key);
        Node head = table[index];

        while (head != null) {
            if (head.key == key) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        Node n = new Node(key, value);
        n.next = table[index];
        table[index] = n;
    }

    Integer get(int key) {
        int index = hash(key);
        Node head = table[index];

        while (head != null) {
            if (head.key == key)
                return head.value;
            head = head.next;
        }
        return null;
    }

    void remove(int key) {
        int index = hash(key);
        Node curr = table[index], prev = null;

        while (curr != null) {
            if (curr.key == key) {
                if (prev == null)
                    table[index] = curr.next;
                else
                    prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();
        map.put(1, 100);
        map.put(2, 200);
        map.put(12, 300);
        System.out.println(map.get(2));
        map.remove(2);
        System.out.println(map.get(2));
    }
}
