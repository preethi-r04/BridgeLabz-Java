import java.util.Scanner;

public class BMIMultiplePersons {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            weight[i] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            height[i] = sc.nextDouble();

            if (weight[i] <= 0 || height[i] <= 0) {
                System.out.println("Invalid input. Enter positive values.");
                i--; // repeat input
                continue;
            }

            double heightInMeters = height[i] / 100;
            bmi[i] = weight[i] / (heightInMeters * heightInMeters);

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        System.out.println("\nBMI Details:");
        for (int i = 0; i < n; i++) {
            System.out.println(
                "Person " + (i + 1) +
                " | Height: " + height[i] +
                " cm | Weight: " + weight[i] +
                " kg | BMI: " + bmi[i] +
                " | Status: " + status[i]
            );
        }
    }
}
