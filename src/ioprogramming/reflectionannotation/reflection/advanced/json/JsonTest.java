package ioprogramming.reflectionannotation.reflection.advanced.json;
import ioprogramming.reflectionannotation.reflection.advanced.object.User;

public class JsonTest {
    public static void main(String[] args) throws Exception {
        User u = new User();
        u.name = "Alex";
        u.age = 30;

        System.out.println(JsonSerializer.toJson(u));
    }
}
