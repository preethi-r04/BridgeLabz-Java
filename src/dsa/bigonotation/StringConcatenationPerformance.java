package dsa.bigonotation;

public class StringConcatenationPerformance {

    public static void main(String[] args) {
        int n = 1_000_000;

        long start;
        String s = "";
        start = System.nanoTime();
        for (int i = 0; i < n; i++) s += "a";
        System.out.println("String: " + (System.nanoTime() - start));

        StringBuilder sb = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i < n; i++) sb.append("a");
        System.out.println("StringBuilder: " + (System.nanoTime() - start));

        StringBuffer sbf = new StringBuffer();
        start = System.nanoTime();
        for (int i = 0; i < n; i++) sbf.append("a");
        System.out.println("StringBuffer: " + (System.nanoTime() - start));
    }
}

