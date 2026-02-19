package ioprogramming.reflectionannotation.annotations.advanced.cache;

import java.lang.reflect.*;
import java.util.*;

public class CacheExecutor {
    private static Map<Integer, Object> cache = new HashMap<>();

    public static Object invoke(Object obj, String method, int arg) throws Exception {
        Method m = obj.getClass().getMethod(method, int.class);

        if (m.isAnnotationPresent(CacheResult.class)) {
            if (cache.containsKey(arg)) {
                return cache.get(arg);
            }
            Object result = m.invoke(obj, arg);
            cache.put(arg, result);
            return result;
        }
        return m.invoke(obj, arg);
    }
}
