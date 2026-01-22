package dsa.stackqueueheap.hashing;

import java.util.HashMap;

public class TwoSum {

    static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int rem = target - arr[i];
            if (map.containsKey(rem))
                return new int[]{map.get(rem), i};
            map.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int[] res = twoSum(arr, 9);
        System.out.println(res[0] + " " + res[1]);
    }
}

