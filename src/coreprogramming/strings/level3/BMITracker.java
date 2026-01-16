package CoreProgramming.Strings.Level3;

import java.util.Scanner;

public class BMITracker {

    static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }

    static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100;
            double bmi = weight / (height * height);
            bmi = Math.round(bmi * 100.0) / 100.0;
            result[i][0] = String.valueOf(data[i][1]);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = getStatus(bmi);
        }
        return result;
    }

    static void display(String[][] arr) {
        System.out.println("Height\tWeight\tBMI\tStatus");
        for (String[] row : arr)
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2] + "\t" + row[3]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }
        display(calculateBMI(data));
        sc.close();
    }
}
