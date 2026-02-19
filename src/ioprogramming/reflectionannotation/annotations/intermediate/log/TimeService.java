package ioprogramming.reflectionannotation.annotations.intermediate.log;

public class TimeService {

    @LogExecutionTime
    public void slowTask() throws Exception {
        Thread.sleep(300);
    }

    @LogExecutionTime
    public void fastTask() throws Exception {
        Thread.sleep(100);
    }
}
