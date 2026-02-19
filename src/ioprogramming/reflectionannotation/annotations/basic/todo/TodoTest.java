package ioprogramming.reflectionannotation.annotations.basic.todo;

import java.lang.reflect.*;

public class TodoTest {
    public static void main(String[] args) {
        for (Method m : Project.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Todo.class)) {
                Todo t = m.getAnnotation(Todo.class);
                System.out.println(m.getName() + " | " + t.task() + " | " + t.assignedTo() + " | " + t.priority());
            }
        }
    }
}

