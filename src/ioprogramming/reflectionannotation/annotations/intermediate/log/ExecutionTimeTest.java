package ioprogramming.reflectionannotation.annotations.intermediate.log;

import java.lang.reflect.*;

public class ExecutionTimeTest {
    public static void main(String[] args) throws Exception {
        TimeService obj = new TimeService();

        for (Method m : TimeService.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(LogExecutionTime.class)) {
                long start = System.nanoTime();
                m.invoke(obj);
                long end = System.nanoTime();
                System.out.println(m.getName() + " -> " + (end - start));
            }
        }
    }
}
