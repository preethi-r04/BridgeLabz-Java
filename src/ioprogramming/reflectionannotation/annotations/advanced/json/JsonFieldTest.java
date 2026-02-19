package ioprogramming.reflectionannotation.annotations.advanced.json;

public class JsonFieldTest {
    public static void main(String[] args) throws Exception {
        JsonUser u = new JsonUser();
        u.name = "Alex";
        u.age = 22;

        System.out.println(JsonConverter.toJson(u));
    }
}
