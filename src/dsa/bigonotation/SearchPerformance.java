package dsa.bigonotation;
import java.util.*;

public class SearchPerformance {

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == target)
                return i;
        return -1;
    }

    static int binarySearch(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] == target) return m;
            if (arr[m] < target) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 1_000_000;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i;
        int target = n - 1;

        long start = System.nanoTime();
        linearSearch(arr, target);
        long end = System.nanoTime();
        System.out.println("Linear Search: " + (end - start));

        start = System.nanoTime();
        binarySearch(arr, target);
        end = System.nanoTime();
        System.out.println("Binary Search: " + (end - start));
    }
}
