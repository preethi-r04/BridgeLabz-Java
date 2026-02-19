package ioprogramming.reflectionannotation.annotations.advanced.cache;

public class ExpensiveService {

    @CacheResult
    public int compute(int x) throws Exception {
        Thread.sleep(500);
        return x * x;
    }
}
