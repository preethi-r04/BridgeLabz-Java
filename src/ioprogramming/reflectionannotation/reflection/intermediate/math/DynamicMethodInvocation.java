package ioprogramming.reflectionannotation.reflection.intermediate.math;

import java.lang.reflect.*;
import java.util.Scanner;

public class DynamicMethodInvocation {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String methodName = sc.nextLine();

        MathOperations obj = new MathOperations();

        Method m = MathOperations.class.getMethod(methodName, int.class, int.class);
        Object result = m.invoke(obj, 10, 5);

        System.out.println(result);
    }
}
