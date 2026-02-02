package javacollectionstreams.iostreams;

import java.io.*;
import java.util.*;

class Employee implements Serializable {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class EmployeeSerialization {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "A", "IT", 50000));
        list.add(new Employee(2, "B", "HR", 40000));

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.dat"));
            oos.writeObject(list);
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.dat"));
            List<Employee> data = (List<Employee>) ois.readObject();
            ois.close();

            for (Employee e : data) {
                System.out.println(e.id + " " + e.name + " " + e.department + " " + e.salary);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
