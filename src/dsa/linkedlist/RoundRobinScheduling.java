package dsa.linkedlist;

public class RoundRobinScheduling {

    class Node {
        int processId;
        int burstTime;
        Node next;

        Node(int id, int bt) {
            processId = id;
            burstTime = bt;
        }
    }

    Node head;

    void addProcess(int id, int bt) {
        Node n = new Node(id, bt);

        if (head == null) {
            head = n;
            n.next = head;
        } else {
            Node temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = n;
            n.next = head;
        }
    }

    void execute(int timeQuantum) {
        if (head == null)
            return;

        Node curr = head;
        Node prev = null;

        while (head != null) {
            if (curr.burstTime <= timeQuantum) {
                System.out.println("Process " + curr.processId + " completed");

                if (curr == head && curr.next == head) {
                    head = null;
                    return;
                }

                if (curr == head) {
                    Node temp = head;
                    while (temp.next != head)
                        temp = temp.next;
                    head = curr.next;
                    temp.next = head;
                } else {
                    prev.next = curr.next;
                }

                curr = curr.next;
            } else {
                curr.burstTime -= timeQuantum;
                prev = curr;
                curr = curr.next;
            }
        }
    }

    public static void main(String[] args) {
        RoundRobinScheduling r = new RoundRobinScheduling();

        r.addProcess(1, 5);
        r.addProcess(2, 8);
        r.addProcess(3, 6);

        r.execute(3);
    }
}
