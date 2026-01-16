package CoreProgramming.Methods.Level1;
import java.util.Scanner;

public class ChocolateDistribution {
    public static void calculate(int choco,int children){
        double perchild = choco/children;
        double remaining = choco%children;

        System.out.println("Choco each child gets: "+perchild);
        System.out.println("Remaining Choco: "+remaining);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choco = sc.nextInt();
        int remaining = sc.nextInt();

        calculate(choco, remaining);
    }
}
