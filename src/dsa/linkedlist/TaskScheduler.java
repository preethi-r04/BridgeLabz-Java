package dsa.linkedlist;
public class TaskScheduler {

    class Node {
        int taskId;
        String taskName;
        int priority;
        String dueDate;
        Node next;

        Node(int id, String name, int p, String d) {
            taskId = id;
            taskName = name;
            priority = p;
            dueDate = d;
        }
    }

    Node head;
    Node current;

    void addTask(int id, String name, int p, String d) {
        Node n = new Node(id, name, p, d);

        if (head == null) {
            head = n;
            n.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = n;
            n.next = head;
        }
    }

    void removeTask(int id) {
        if (head == null) return;

        Node curr = head;
        Node prev = null;

        do {
            if (curr.taskId == id) {
                if (curr == head) {
                    Node temp = head;
                    while (temp.next != head) {
                        temp = temp.next;
                    }
                    head = head.next;
                    temp.next = head;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    void viewNextTask() {
        if (current == null)
            current = head;
        else
            current = current.next;

        System.out.println(
                current.taskId + " " +
                        current.taskName + " " +
                        current.priority + " " +
                        current.dueDate
        );
    }

    void displayTasks() {
        if (head == null) return;

        Node temp = head;
        do {
            System.out.println(
                    temp.taskId + " " +
                            temp.taskName + " " +
                            temp.priority + " " +
                            temp.dueDate
            );
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        TaskScheduler t = new TaskScheduler();

        t.addTask(1, "Design", 1, "2026-01-25");
        t.addTask(2, "Coding", 2, "2026-01-26");
        t.addTask(3, "Testing", 3, "2026-01-27");

        System.out.println("All Tasks:");
        t.displayTasks();

        System.out.println("Next Task:");
        t.viewNextTask();

        System.out.println("After Removing Task 2:");
        t.removeTask(2);
        t.displayTasks();
    }
}

