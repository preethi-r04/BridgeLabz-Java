package CoreProgramming.ClassObject.Level2;

class MovieTicket {

    private String movieName;
    private int seatNum;
    private double price;

    
    public MovieTicket(String movieName) {
        this.movieName = movieName;
    }

    public void bookTicket(int seatNum, double price) {
        this.seatNum = seatNum;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNum);
        System.out.println("Price: " + price);
    }
}

public class Movie {
    public static void main(String[] args) {

        MovieTicket m1 = new MovieTicket("VIP");
        m1.bookTicket(22, 120);
        m1.displayDetails();
    }
}
