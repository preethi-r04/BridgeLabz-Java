import java.util.Scanner;

public class HandShakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Student: ");
        int stu = sc.nextInt();
        int HandShakes = (stu*(stu-1))/2;
        System.out.println("The possible handshakes: "+HandShakes);
        sc.close();
        
    }
    
}
