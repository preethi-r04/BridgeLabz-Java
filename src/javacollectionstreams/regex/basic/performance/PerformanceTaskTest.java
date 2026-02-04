package javacollectionstreams.regex.basic.performance;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class PerformanceTaskTest {

    PerformanceTask task = new PerformanceTask();

    @Test
    @Timeout(2)
    void testTimeout() throws InterruptedException {
        task.longRunningTask();
    }
}
