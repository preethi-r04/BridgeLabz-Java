package dsa.bigonotation;

import java.util.*;

public class SortingPerformance {

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
    }

    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    static void merge(int[] arr, int l, int m, int r) {
        int[] L = Arrays.copyOfRange(arr, l, m + 1);
        int[] R = Arrays.copyOfRange(arr, m + 1, r + 1);
        int i = 0, j = 0, k = l;
        while (i < L.length && j < R.length)
            arr[k++] = L[i] <= R[j] ? L[i++] : R[j++];
        while (i < L.length) arr[k++] = L[i++];
        while (j < R.length) arr[k++] = R[j++];
    }

    static void quickSort(int[] arr, int l, int h) {
        if (l < h) {
            int p = partition(arr, l, h);
            quickSort(arr, l, p - 1);
            quickSort(arr, p + 1, h);
        }
    }

    static int partition(int[] arr, int l, int h) {
        int p = arr[h], i = l - 1;
        for (int j = l; j < h; j++)
            if (arr[j] < p) {
                i++;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        int t = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = t;
        return i + 1;
    }

    public static void main(String[] args) {
        int n = 10000;
        Random r = new Random();
        int[] a1 = r.ints(n).toArray();
        int[] a2 = a1.clone();
        int[] a3 = a1.clone();

        long s = System.nanoTime();
        bubbleSort(a1);
        System.out.println("Bubble: " + (System.nanoTime() - s));

        s = System.nanoTime();
        mergeSort(a2, 0, a2.length - 1);
        System.out.println("Merge: " + (System.nanoTime() - s));

        s = System.nanoTime();
        quickSort(a3, 0, a3.length - 1);
        System.out.println("Quick: " + (System.nanoTime() - s));
    }
}
