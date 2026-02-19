package ioprogramming.reflectionannotation.annotations.intermediate.max;

import java.lang.reflect.*;

public class User {

    @MaxLength(10)
    private String username;

    public User(String username) throws Exception {
        Field f = User.class.getDeclaredField("username");
        MaxLength ml = f.getAnnotation(MaxLength.class);

        if (username.length() > ml.value()) {
            throw new IllegalArgumentException("Too long");
        }

        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
