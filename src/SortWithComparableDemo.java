import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {
    int age;
    String name;

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee that) {
        if (this.age > that.age) {
            return 1;
        }else {
            return -1;
        }
    }
}

public class SortWithComparableDemo {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(55, "John"));
        employees.add(new Employee(43, "Jane"));
        employees.add(new Employee(28, "Bob"));
        employees.add(new Employee(36, "Alice"));
        employees.add(new Employee(21, "Charlie"));

        System.out.println("Before sorting: ");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        Comparator com = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1.age > e2.age) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        Collections.sort(employees, com);
        System.out.println("After sorting: ");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        Collections.reverse(employees);
        System.out.println("After reverse sorting: ");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        Collections.shuffle(employees);
        System.out.println("After shuffle: ");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        Collections.sort(employees);
        System.out.println("After sorting using Comparable: ");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
