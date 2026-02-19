package ioprogramming.reflectionannotation.reflection.basic.calculator;

import java.lang.reflect.*;

public class InvokePrivateMethod {
    public static void main(String[] args) throws Exception {
        Calculator c = new Calculator();

        Method m = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        m.setAccessible(true);

        Object result = m.invoke(c, 5, 6);
        System.out.println(result);
    }
}
