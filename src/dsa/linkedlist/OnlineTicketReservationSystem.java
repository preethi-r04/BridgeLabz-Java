package dsa.linkedlist;

public class OnlineTicketReservationSystem {

    class Node {
        int ticketId;
        String customerName;
        String movieName;
        String seatNumber;
        String bookingTime;
        Node next;

        Node(int id, String c, String m, String s, String t) {
            ticketId = id;
            customerName = c;
            movieName = m;
            seatNumber = s;
            bookingTime = t;
        }
    }

    Node head;

    void bookTicket(int id, String c, String m, String s, String t) {
        Node n = new Node(id, c, m, s, t);

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

    void cancelTicket(int id) {
        if (head == null)
            return;

        Node curr = head;
        Node prev = null;

        do {
            if (curr.ticketId == id) {
                if (curr == head) {
                    Node temp = head;
                    while (temp.next != head)
                        temp = temp.next;
                    head = curr.next;
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

    void displayTickets() {
        if (head == null)
            return;

        Node temp = head;
        do {
            System.out.println(
                    temp.ticketId + " " +
                            temp.customerName + " " +
                            temp.movieName + " " +
                            temp.seatNumber + " " +
                            temp.bookingTime
            );
            temp = temp.next;
        } while (temp != head);
    }

    int totalTickets() {
        if (head == null)
            return 0;

        int count = 0;
        Node temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }

    public static void main(String[] args) {
        OnlineTicketReservationSystem t = new OnlineTicketReservationSystem();

        t.bookTicket(1, "John", "Avatar", "A1", "10:00 AM");
        t.bookTicket(2, "Emma", "Inception", "B3", "10:05 AM");
        t.bookTicket(3, "Alex", "Titanic", "C2", "10:10 AM");

        t.displayTickets();
        System.out.println("Total Tickets: " + t.totalTickets());

        t.cancelTicket(2);
        t.displayTickets();
    }
}
