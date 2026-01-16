package CoreProgramming.AccessModifiers;
class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void display() {
        System.out.println(employeeID);
        System.out.println(department);
        System.out.println(getSalary());
    }
}

public class EmpApp {
    public static void main(String[] args) {
        Manager m1 = new Manager(501, "IT", 75000);
        m1.display();
    }
}