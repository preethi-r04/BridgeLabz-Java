package CoreProgramming.Methods.Level1;

import java.util.Scanner;

public class QuotientRemainder {

    public static void calQuotientRemainder(double num1, double num2) {
        double quotient = num1 / num2;
        double remainder = num1 % num2;

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        calQuotientRemainder(num1, num2);

        sc.close();
    }
}
