package ioprogramming.reflectionannotation.annotations.advanced.role;

import java.lang.reflect.*;

public class RoleAccessTest {
    public static void main(String[] args) throws Exception {
        String currentRole = "USER";
        AdminService obj = new AdminService();

        for (Method m : AdminService.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed r = m.getAnnotation(RoleAllowed.class);
                if (r.value().equals(currentRole)) {
                    m.invoke(obj);
                } else {
                    System.out.println("Access Denied!");
                }
            }
        }
    }
}
