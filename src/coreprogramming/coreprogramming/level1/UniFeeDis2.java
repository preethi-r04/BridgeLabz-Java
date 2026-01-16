import java.util.Scanner;

public class UniFeeDis2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fees: ");
        int fee = sc.nextInt();
        System.out.print("Discount: ");
        double dis = sc.nextDouble();
        double disAmt = (fee*dis)/100;
        double finalAmt = fee-disAmt;
        System.out.println("The discount amount s INR "+disAmt+" and final discounted fee is INR "+ finalAmt);
sc.close();
    }
}
