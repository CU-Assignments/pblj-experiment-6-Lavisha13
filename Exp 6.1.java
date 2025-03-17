//write a java program to sort a list of employees objects(name, age ,salary)using lambda expression.

CODE: 
import java.util.*;

class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}

public class EmployeeSorter {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Vaani", 30, 50000));
        employees.add(new Employee("Manya", 25, 60000));
        employees.add(new Employee("Rajeev", 35, 55000));
        employees.add(new Employee("Mohit", 28, 45000));

        System.out.println("Before Sorting:");
        employees.forEach(System.out::println);

        employees.sort(Comparator.comparing(emp -> emp.name));
        System.out.println("\nSorted by Name:");
        employees.forEach(System.out::println);

        employees.sort(Comparator.comparingInt(emp -> emp.age));
        System.out.println("\nSorted by Age:");
        employees.forEach(System.out::println);

        employees.sort(Comparator.comparingDouble(emp -> emp.salary));
        System.out.println("\nSorted by Salary:");
        employees.forEach(System.out::println);
    }
}
