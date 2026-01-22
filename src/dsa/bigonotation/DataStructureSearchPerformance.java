package dsa.bigonotation;

import java.util.*;

public class DataStructureSearchPerformance {

    public static void main(String[] args) {

        int n = 1_000_000;
        int target = n - 1;

        int[] arr = new int[n];
        HashSet<Integer> hs = new HashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            arr[i] = i;
            hs.add(i);
            ts.add(i);
        }

        long s = System.nanoTime();
        for (int x : arr)
            if (x == target) break;
        System.out.println("Array: " + (System.nanoTime() - s));

        s = System.nanoTime();
        hs.contains(target);
        System.out.println("HashSet: " + (System.nanoTime() - s));

        s = System.nanoTime();
        ts.contains(target);
        System.out.println("TreeSet: " + (System.nanoTime() - s));
    }
}
