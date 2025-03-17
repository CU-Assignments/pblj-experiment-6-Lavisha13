//create a program to use lambda expressions and stream operations to filter students scoring above 75% sort them by marks and display their names.

CODE: import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    double marks;

    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }
}
public class StudentFilter {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Vaani", 82),
            new Student("Manya", 68),
            new Student("Sam", 90),
            new Student("Rajeev", 74),
            new Student("Mohit", 78)
        );

        List<String> topStudents = students.stream()
            .filter(s -> s.getMarks() > 75)  
            .sorted(Comparator.comparingDouble(Student::getMarks).reversed()) 
            .map(Student::getName)
            .collect(Collectors.toList());

        System.out.println("Students scoring above 75%, sorted by marks:");
        topStudents.forEach(System.out::println);
    }
}
