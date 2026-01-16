import java.util.Scanner;
public class FeetToYard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("feet: ");
        double feet = sc.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println(
            "The distance in yards is " + yards +
            " and in miles is " + miles
        );
        sc.close();
    }
}
    
