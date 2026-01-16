import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = sc.nextInt();
        for(int i=6;i<=9;i++){
            int ml = num*i;
            System.out.println(num+" * "+i+" = "+ml);
        }
    }
}
