package ioprogramming.reflectionannotation.reflection.basic.student;

public class DynamicObjectCreation {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName(
                "ioprogramming.reflectionannotation.reflection.basic.student.Student"
        );

        Object obj = clazz.getDeclaredConstructor().newInstance();
        System.out.println(obj.getClass().getName());
    }
}
