package CoreProgramming.Methods.Level1;
import java.util.Scanner;
public class WindChill {
    public static void calculateWind(double temp,double speed){
        double windchill = 35.74 + 0.6215 * temp + (0.4275 *temp - 35.75)*Math.pow(speed,0.16);
        System.out.println("WindChill: "+windchill);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temp: ");
        double temp = sc.nextDouble();
        System.out.println("Speed: ");
        double speed = sc.nextDouble();

        calculateWind(temp, speed);
    }
}
