package ioprogramming.reflectionannotation.reflection.advanced.greetings;

import java.lang.reflect.*;

public class LoggingProxy implements InvocationHandler {
    private Object target;

    public LoggingProxy(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Calling: " + method.getName());
        return method.invoke(target, args);
    }
}
