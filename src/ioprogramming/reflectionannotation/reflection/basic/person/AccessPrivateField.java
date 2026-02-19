package ioprogramming.reflectionannotation.reflection.basic.person;

import java.lang.reflect.*;

public class AccessPrivateField {
    public static void main(String[] args) throws Exception {
        Person p = new Person();

        Field field = Person.class.getDeclaredField("age");
        field.setAccessible(true);

        field.set(p, 25);
        System.out.println(field.get(p));
    }
}
