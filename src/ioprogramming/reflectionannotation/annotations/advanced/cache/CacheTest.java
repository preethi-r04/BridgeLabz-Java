package ioprogramming.reflectionannotation.annotations.advanced.cache;

public class CacheTest {
    public static void main(String[] args) throws Exception {
        ExpensiveService s = new ExpensiveService();

        System.out.println(CacheExecutor.invoke(s, "compute", 5));
        System.out.println(CacheExecutor.invoke(s, "compute", 5));
    }
}

