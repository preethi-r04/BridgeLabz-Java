package CoreProgramming.Methods.Level2;
import java.util.*;

public class RandomArr {

    public static int[] generateRandom(int size){
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 9000) + 1000;
        }
        return arr;
    }

    public static double[] calc(int[] arr){
        int min = arr[0];
        int max = arr[0];
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        double avg = (double) sum / arr.length;

        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {

        int[] ran = generateRandom(5);
        System.out.println("Array: " + Arrays.toString(ran));

        double[] result = calc(ran);

        System.out.println("Average: " + result[0]);
        System.out.println("Minimum: " + (int) result[1]);
        System.out.println("Maximum: " + (int) result[2]);
    }
}


