package ioprogramming.reflectionannotation.reflection.intermediate.configure;

import java.lang.reflect.*;

public class ModifyStaticField {
    public static void main(String[] args) throws Exception {
        Field field = Configuration.class.getDeclaredField("API_KEY");
        field.setAccessible(true);

        field.set(null, "NEW_KEY");
        System.out.println(field.get(null));
    }
}
