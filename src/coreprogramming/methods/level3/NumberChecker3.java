package CoreProgramming.Methods.Level3;

import java.util.Arrays;

public class NumberChecker3 {
     static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    static int[] storeDigits(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }

    static boolean compareArrays(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    static boolean isPalindrome(int num) {
        int[] digits = storeDigits(num);
        int[] reversed = reverseArray(digits);
        return compareArrays(digits, reversed);
    }

    static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 12021;

        int[] digits = storeDigits(num);
        int[] reversed = reverseArray(digits);

        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Reversed: " + Arrays.toString(reversed));
        System.out.println("Arrays Equal: " + compareArrays(digits, reversed));
        System.out.println("Palindrome Number: " + isPalindrome(num));
        System.out.println("Duck Number: " + isDuckNumber(digits));
    }
    
}
