package ioprogramming.reflectionannotation.reflection.advanced.object;
import java.util.*;

public class ObjectMapperTest {
    public static void main(String[] args) throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "John");
        map.put("age", 22);

        User user = ObjectMapper.toObject(User.class, map);
        System.out.println(user.name + " " + user.age);
    }
}
