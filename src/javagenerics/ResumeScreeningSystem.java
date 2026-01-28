package javagenerics;

import java.util.*;

abstract class JobRole {
    String roleName;
    JobRole(String roleName) {
        this.roleName = roleName;
    }
    public String toString() {
        return roleName;
    }
}

class SoftwareEngineer extends JobRole {
    SoftwareEngineer() {
        super("Software Engineer");
    }
}

class DataScientist extends JobRole {
    DataScientist() {
        super("Data Scientist");
    }
}

class ProductManager extends JobRole {
    ProductManager() {
        super("Product Manager");
    }
}

class Resume<T extends JobRole> {
    String candidateName;
    T role;

    Resume(String candidateName, T role) {
        this.candidateName = candidateName;
        this.role = role;
    }
}

class ScreeningPipeline {
    static void screenRoles(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println(role);
        }
    }
}

public class ResumeScreeningSystem {
    public static void main(String[] args) {
        List<JobRole> roles = new ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());

        ScreeningPipeline.screenRoles(roles);
    }
}

