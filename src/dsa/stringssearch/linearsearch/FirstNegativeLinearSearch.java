package dsa.stringssearch.linearsearch;


public class FirstNegativeLinearSearch {

    static int find(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 0)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, -5, 7};
        System.out.println(find(arr));
    }
}
