package ioprogramming.reflectionannotation.reflection.basic.classinfo;

import java.lang.reflect.*;
import java.util.Scanner;

public class ClassInfo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String className = sc.nextLine();

        Class<?> clazz = Class.forName(className);

        System.out.println("Methods:");
        for (Method m : clazz.getDeclaredMethods()) {
            System.out.println(m);
        }

        System.out.println("Fields:");
        for (Field f : clazz.getDeclaredFields()) {
            System.out.println(f);
        }

        System.out.println("Constructors:");
        for (Constructor<?> c : clazz.getDeclaredConstructors()) {
            System.out.println(c);
        }
    }
}
