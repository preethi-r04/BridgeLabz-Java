package CoreProgramming.Methods.Level2;
import java.util.Scanner;

public class BMI {

    public static void calculateBMI(double[][] data){
        for(int i = 0; i < data.length; i++){
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100;

            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi;
        }
    }

    public static void bmistatus(double[][] data){
        for(int i = 0; i < data.length; i++){
            double bmi = data[i][2];

            System.out.print("Weight: " + data[i][0] + " ");
            System.out.print("Height: " + data[i][1] + " ");
            System.out.print("BMI: " + bmi + " ");

            if (bmi < 18.5)
                System.out.println("Status: Underweight");
            else if (bmi < 25)
                System.out.println("Status: Normal");
            else if (bmi < 30)
                System.out.println("Status: Overweight");
            else
                System.out.println("Status: Obese");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] bmidata = new double[10][3];

        for(int i = 0; i < bmidata.length; i++){
            System.out.println("Enter Person " + (i + 1));
            System.out.print("Weight: ");
            bmidata[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            bmidata[i][1] = sc.nextDouble();
        }

        calculateBMI(bmidata);
        System.out.println("\nBMI REPORT");
        bmistatus(bmidata);

        sc.close();
    }
}
