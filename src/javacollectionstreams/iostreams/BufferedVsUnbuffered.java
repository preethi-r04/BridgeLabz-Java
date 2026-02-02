package javacollectionstreams.iostreams;

import java.io.*;

public class BufferedVsUnbuffered {
    public static void main(String[] args) throws IOException {
        String source = "largefile.dat";
        String dest1 = "unbuffered.dat";
        String dest2 = "buffered.dat";

        long start = System.nanoTime();
        copyUnbuffered(source, dest1);
        long end = System.nanoTime();
        System.out.println("Unbuffered Time: " + (end - start));

        start = System.nanoTime();
        copyBuffered(source, dest2);
        end = System.nanoTime();
        System.out.println("Buffered Time: " + (end - start));
    }

    static void copyUnbuffered(String src, String dest) throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dest);
        byte[] buffer = new byte[4096];
        int bytes;
        while ((bytes = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, bytes);
        }
        fis.close();
        fos.close();
    }

    static void copyBuffered(String src, String dest) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
        byte[] buffer = new byte[4096];
        int bytes;
        while ((bytes = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, bytes);
        }
        bis.close();
        bos.close();
    }
}
