package dsa.stringssearch.binarysearch;

public class PeakElementBinarySearch {

    static int peak(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (arr[m] < arr[m + 1])
                l = m + 1;
            else
                r = m;
        }
        return arr[l];
    }

    public static void main(String[] args) {
        int[] arr = {1,3,20,4,1};
        System.out.println(peak(arr));
    }
}
