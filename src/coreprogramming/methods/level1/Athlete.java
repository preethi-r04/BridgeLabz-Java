package CoreProgramming.Methods.Level1;

import java.util.Scanner;

public class Athlete {
    public double calculaterun(double s1, double s2, double s3){
        double perimeter = s1+s2+s3;
        double distance = 5000;
        return distance/perimeter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Side 1:");
        double s1 = sc.nextDouble();

        System.out.print("Side 2:");
        double s2 = sc.nextDouble();

        System.out.print("Side 3:");
        double s3 = sc.nextDouble();

        // double distance = 5.0;

        Athlete obj = new Athlete();
        double res = obj.calculaterun(s1, s2, s3);
        System.out.println("The total run: "+ res);
    }
}
