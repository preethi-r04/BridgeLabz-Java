package ioprogramming.reflectionannotation.annotations.advanced.json;

public class JsonUser {

    @JsonField(name = "user_name")
    String name;

    @JsonField(name = "user_age")
    int age;
}
