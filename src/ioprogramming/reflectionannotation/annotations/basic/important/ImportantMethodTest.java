package ioprogramming.reflectionannotation.annotations.basic.important;

import java.lang.reflect.*;

public class ImportantMethodTest {
    public static void main(String[] args) {
        for (Method m : Service.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod im = m.getAnnotation(ImportantMethod.class);
                System.out.println(m.getName() + " -> " + im.level());
            }
        }
    }
}
