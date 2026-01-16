package CoreProgramming.Methods.Level1;
import java.util.Scanner;

public class SI {
    public double calculateSI(double prin,double rate,double time){
        return (prin*rate*time)/100;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Principle: ");
    double prin = sc.nextDouble();

    System.out.println("Rate: ");
    double rate = sc.nextDouble();

    System.out.println("Time: ");
    double time = sc.nextDouble();

    SI obj = new SI();
    double si = obj.calculateSI(prin, rate, time);
    System.out.println("The Simple Interest: "+ si);
}
    
}
