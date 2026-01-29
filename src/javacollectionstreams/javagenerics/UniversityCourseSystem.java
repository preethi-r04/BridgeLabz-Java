package javacollectionstreams.javagenerics;

import java.util.*;

abstract class CourseType {
    String evaluation;
    CourseType(String evaluation) {
        this.evaluation = evaluation;
    }
    public String toString() {
        return evaluation;
    }
}

class ExamCourse extends CourseType {
    ExamCourse() {
        super("Exam Based");
    }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse() {
        super("Assignment Based");
    }
}

class ResearchCourse extends CourseType {
    ResearchCourse() {
        super("Research Based");
    }
}

class Course<T extends CourseType> {
    String courseName;
    T type;

    Course(String courseName, T type) {
        this.courseName = courseName;
        this.type = type;
    }
}

class CourseUtil {
    static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course);
        }
    }
}

public class UniversityCourseSystem {
    public static void main(String[] args) {
        List<CourseType> list = new ArrayList<>();
        list.add(new ExamCourse());
        list.add(new ResearchCourse());

        CourseUtil.displayCourses(list);
    }
}
