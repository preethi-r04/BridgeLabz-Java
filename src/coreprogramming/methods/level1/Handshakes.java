package CoreProgramming.Methods.Level1;
import java.util.Scanner;
public class Handshakes {
    public int handshakes(int stu){
        return (stu*(stu-1))/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No. of Student: ");
        int stu = sc.nextInt();

        Handshakes obj = new Handshakes();
        int total = obj.handshakes(stu);
        System.out.print("Maximum Handshakes: "+total);
        
    }
    
}
