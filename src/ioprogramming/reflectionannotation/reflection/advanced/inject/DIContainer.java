package ioprogramming.reflectionannotation.reflection.advanced.inject;

import java.lang.reflect.*;

public class DIContainer {
    public static <T> T create(Class<T> clazz) throws Exception {
        T obj = clazz.getDeclaredConstructor().newInstance();

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                Object dep = field.getType().getDeclaredConstructor().newInstance();
                field.setAccessible(true);
                field.set(obj, dep);
            }
        }
        return obj;
    }
}
