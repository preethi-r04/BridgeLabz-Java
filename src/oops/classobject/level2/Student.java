package CoreProgramming.ClassObject.Level2;

class StudentGrade {

    private String name;
    private int rollNum;
    private double marks;

    public StudentGrade(String name, int rollNum, double marks) {
        this.name = name;
        this.rollNum = rollNum;
        this.marks = marks;
    }

    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "Fail";
        }
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNum);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

public class Student {
    public static void main(String[] args) {
        StudentGrade s1 = new StudentGrade("Abi", 101, 84);
        s1.displayDetails();
    }
}

