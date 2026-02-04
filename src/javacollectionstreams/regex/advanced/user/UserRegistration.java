package javacollectionstreams.regex.advanced.user;

public class UserRegistration {

    public boolean registerUser(String username, String email, String password) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException();
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException();
        }
        if (password == null || password.length() < 6) {
            throw new IllegalArgumentException();
        }
        return true;
    }
}

