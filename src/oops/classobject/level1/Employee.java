package CoreProgramming.ClassObject.Level1;

class EmployeeDetails {
    private String name;
    private int id;
    private double salary;

    EmployeeDetails(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void displayDetails(){
        System.out.println("Employee name: "+name);
        System.out.println("Employee ID: "+id);
        System.out.println("Salary: "+salary);
    }
    
}
public class Employee {
    public static void main(String[] args) {
        EmployeeDetails emp1 = new EmployeeDetails("Preethii", 101, 200000);
        emp1.displayDetails();
    }
}
