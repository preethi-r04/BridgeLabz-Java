package oops.encapsulation;

import java.util.*;

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

abstract class Employee {
    private int employeeId;
    private String name;
    protected double baseSalary;

    Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee implements Department {
    private String department;

    FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    double calculateSalary() {
        return baseSalary;
    }

    public void assignDepartment(String dept) {
        department = dept;
    }

    public String getDepartmentDetails() {
        return department;
    }
}

class PartTimeEmployee extends Employee {
    private int hours;

    PartTimeEmployee(int id, String name, double rate, int hours) {
        super(id, name, rate);
        this.hours = hours;
    }

    double calculateSalary() {
        return baseSalary * hours;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new FullTimeEmployee(1, "Alice", 50000));
        list.add(new PartTimeEmployee(2, "Bob", 500, 40));

        for (Employee e : list) {
            e.displayDetails();
            System.out.println();
        }
    }
}
