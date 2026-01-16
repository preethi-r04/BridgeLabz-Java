import java.util.Scanner;

public class BMIMultiDimensional {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {

            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            personData[i][1] = sc.nextDouble();

            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.out.println("Invalid input. Enter positive values.");
                i--;
                continue;
            }

            double heightInMeters = personData[i][1] / 100;
            personData[i][2] = personData[i][0] / (heightInMeters * heightInMeters);

            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nBMI Details:");
        for (int i = 0; i < number; i++) {
            System.out.println(
                "Person " + (i + 1) +
                " | Height: " + personData[i][1] +
                " cm | Weight: " + personData[i][0] +
                " kg | BMI: " + personData[i][2] +
                " | Status: " + weightStatus[i]
            );
        }
    }
}

