package dsa.bigonotation;
import java.io.*;

public class FileReadingPerformance {

    public static void main(String[] args) throws Exception {

        long start;
        BufferedReader br1 = new BufferedReader(new FileReader("large.txt"));
        start = System.nanoTime();
        while (br1.readLine() != null) {}
        br1.close();
        System.out.println("FileReader: " + (System.nanoTime() - start));

        BufferedReader br2 = new BufferedReader(
                new InputStreamReader(new FileInputStream("large.txt"))
        );
        start = System.nanoTime();
        while (br2.readLine() != null) {}
        br2.close();
        System.out.println("InputStreamReader: " + (System.nanoTime() - start));
    }
}
