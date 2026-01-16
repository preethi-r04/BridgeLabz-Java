import java.util.Scanner;
public class TravelDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter from city: ");
        String fromCity = sc.nextLine();
        System.out.print("Enter via city: ");
        String viaCity = sc.nextLine();
        System.out.print("Enter to city: ");
        String toCity = sc.nextLine();
        System.out.print("Enter distance from source to via (in miles): ");
        double fromToVia = sc.nextDouble();
        System.out.print("Enter distance from via to destination (in miles): ");
        double viaToFinalCity = sc.nextDouble();

        System.out.print("Enter time taken (in hours): ");
        double timeTaken = sc.nextDouble();
        double totalDistance = fromToVia + viaToFinalCity;
        double speed = totalDistance / timeTaken;
        System.out.println(
            "Name: " + name + "\n" +
            "Travel Route: " + fromCity + " -> " + viaCity + " -> " + toCity + "\n" +
            "Total Distance: " + totalDistance + " miles\n" +
            "Time Taken: " + timeTaken + " hours\n" +
            "Average Speed: " + speed + " miles/hour"
        );
    }
}
