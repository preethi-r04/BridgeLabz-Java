package Oops.static_this_final;

class Employee {

    static String companyName = "Tech Corp";
    static int totalEmployees = 0;

    final int id;
    String name;
    String designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayDetails(Object obj) {
        if (obj instanceof Employee) {
            Employee e = (Employee) obj;
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + e.name);
            System.out.println("ID: " + e.id);
            System.out.println("Designation: " + e.designation);
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee("John", 201, "Developer");
        emp.displayDetails(emp);
        Employee.displayTotalEmployees();
    }
}
