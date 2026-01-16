package CoreProgramming.Methods.Level1;

import java.util.Scanner;

public class TrigonometricFunctions {


    public static double[] calculateTrigonometricFunctions(double angleInDegrees) {

        double angleInRadians = Math.toRadians(angleInDegrees);

        double sine = Math.sin(angleInRadians);
        double cosine = Math.cos(angleInRadians);
        double tangent = Math.tan(angleInRadians);

        return new double[] { sine, cosine, tangent };
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

      
        double[] result = calculateTrigonometricFunctions(angle);

       
        System.out.println("Sine of " + angle + "° = " + result[0]);
        System.out.println("Cosine of " + angle + "° = " + result[1]);
        System.out.println("Tangent of " + angle + "° = " + result[2]);

        sc.close();
    }
}
