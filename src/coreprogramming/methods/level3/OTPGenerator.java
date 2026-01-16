package CoreProgramming.Methods.Level3;

import java.util.Arrays;

public class OTPGenerator {

    static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }

    static int[] generateOTPs(int n) {
        int[] otps = new int[n];
        for (int i = 0; i < n; i++) {
            otps[i] = generateOTP();
        }
        return otps;
    }

    static boolean isUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = generateOTPs(10);

        System.out.println("Generated OTPs: " + Arrays.toString(otps));
        System.out.println("All OTPs Unique: " + isUnique(otps));
    }
}
