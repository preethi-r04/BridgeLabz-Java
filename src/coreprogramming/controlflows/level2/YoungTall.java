import java.util.*;

public class YoungTall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age1: ");
        int age1 = sc.nextInt();
        System.out.println("Enter the Height1: ");
        int height1 = sc.nextInt();
        
        

        System.out.print("Enter the age2: ");
        int age2 = sc.nextInt();
        System.out.println("Enter the Height2: ");
        int height2 = sc.nextInt();

        System.out.print("Enter the age3 ");
        int age3 = sc.nextInt();
        System.out.println("Enter the Height3: ");
        int height3 = sc.nextInt();

        if(age1 < age2 && age1 < age3){
            System.out.println("Person 1 is the youngest!!");

        }
        else if(age2 < age1 && age2 < age3){
            System.out.println("Person 2 is the youngest!!");

        }
        else{
            System.out.println("Perosn 3 is the youngest!!");
        }

        if (height1>height2 && height1>height3){
            System.out.println("Person 1 is the tallest!!");
        }
        else if (height2>height1 && height2>height3){
            System.out.println("Person 2 is the tallest!!");
        }
        else{
            System.out.println("Person 3 is the tallest!!");
        }
        sc.close();

    }
}
