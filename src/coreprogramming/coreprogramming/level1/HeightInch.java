import java.util.Scanner;
public class HeightInch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  height = sc.nextDouble();
         double totalInches = height / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.println(
            "Your Height in cm is " + height +
            " while in feet is " + feet +
            " and inches is " + inches);
sc.close();
    }
    
}
