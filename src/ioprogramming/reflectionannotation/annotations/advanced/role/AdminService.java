package ioprogramming.reflectionannotation.annotations.advanced.role;

public class AdminService {

    @RoleAllowed("ADMIN")
    public void deleteUser() {
        System.out.println("User deleted");
    }
}

