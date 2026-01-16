package CoreProgramming.Methods.Level1;

import java.util.Scanner;

public class SmallestLargest {

    public static void findSmallestLargest(int num1, int num2, int num3) {

        // Finding smallest
        if (num1 <= num2 && num1 <= num3) {
            System.out.println("Smallest: " + num1);
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("Smallest: " + num2);
        } else {
            System.out.println("Smallest: " + num3);
        }

        // Finding largest
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Largest: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Largest: " + num2);
        } else {
            System.out.println("Largest: " + num3);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        System.out.print("Enter num3: ");
        int num3 = sc.nextInt();

        findSmallestLargest(num1, num2, num3);

        sc.close();
    }
}
