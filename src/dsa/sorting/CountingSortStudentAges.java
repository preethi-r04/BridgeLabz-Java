package dsa.sorting;

public class CountingSortStudentAges {

    static void countingSort(int[] arr, int min, int max) {
        int[] count = new int[max - min + 1];

        for (int x : arr)
            count[x - min]++;

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0)
                arr[index++] = i + min;
        }
    }

    public static void main(String[] args) {
        int[] ages = {12, 15, 11, 14, 13, 16, 10, 18};
        countingSort(ages, 10, 18);
        for (int x : ages)
            System.out.print(x + " ");
    }
}
