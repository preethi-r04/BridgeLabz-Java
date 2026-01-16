package CoreProgramming.AccessModifiers;

class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}

class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, name, cgpa);
    }

    public void display() {
        System.out.println(rollNumber);
        System.out.println(name);
        System.out.println(getCgpa());
    }
}

public class UniApp {
    public static void main(String[] args) {
        PostgraduateStudent s1 = new PostgraduateStudent(101, "Abi", 8.7);
        s1.display();
    }
}

