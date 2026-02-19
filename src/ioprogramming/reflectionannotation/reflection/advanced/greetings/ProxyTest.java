package ioprogramming.reflectionannotation.reflection.advanced.greetings;

import java.lang.reflect.*;

public class ProxyTest {
    public static void main(String[] args) {
        Greeting g = new GreetingImpl();

        Greeting proxy = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingProxy(g)
        );

        proxy.sayHello();
    }
}

