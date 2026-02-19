package ioprogramming.reflectionannotation.annotations.basic.important;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ImportantMethod {
    String level() default "HIGH";
}
