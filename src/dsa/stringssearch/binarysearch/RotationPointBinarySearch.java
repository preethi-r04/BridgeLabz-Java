package dsa.stringssearch.binarysearch;


public class RotationPointBinarySearch {

    static int find(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (arr[m] > arr[r])
                l = m + 1;
            else
                r = m;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2,3};
        System.out.println(find(arr));
    }
}

