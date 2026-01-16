package CoreProgramming.Constructor;

class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this("Guest", "Standard", 1);
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

 
    public HotelBooking(HotelBooking h) {
        this.guestName = h.guestName;
        this.roomType = h.roomType;
        this.nights = h.nights;
    }

    public void display() {
        System.out.println(guestName + " | " + roomType + " | " + nights);
    }
}

public class HotelApp {
    public static void main(String[] args) {
        HotelBooking h1 = new HotelBooking("Abi", "Deluxe", 3);
        HotelBooking h2 = new HotelBooking(h1);

        h1.display();
        h2.display();
    }
}
