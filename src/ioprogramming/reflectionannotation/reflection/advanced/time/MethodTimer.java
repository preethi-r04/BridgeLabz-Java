package ioprogramming.reflectionannotation.reflection.advanced.time;

import java.lang.reflect.*;

public class MethodTimer {
    public static void main(String[] args) throws Exception {
        TimingExample obj = new TimingExample();

        Method method = TimingExample.class.getMethod("task");

        long start = System.nanoTime();
        method.invoke(obj);
        long end = System.nanoTime();

        System.out.println("Execution Time: " + (end - start));
    }
}
