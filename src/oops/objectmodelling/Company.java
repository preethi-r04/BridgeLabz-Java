package Oops.ObjectModelling;
import java.util.ArrayList;

class Company {
    ArrayList<Department> departments = new ArrayList<>();

    Company() {
        departments.add(new Department("HR"));
        departments.add(new Department("IT"));
    }
}

class Department {
    String deptName;
    ArrayList<Employee> employees = new ArrayList<>();

    Department(String deptName) {
        this.deptName = deptName;
        employees.add(new Employee("John"));
    }
}

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}
