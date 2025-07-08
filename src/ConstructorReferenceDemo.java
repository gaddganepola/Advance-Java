import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConstructorReferenceDemo {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Amal", "Kamal", "Laxman", "Lakiya", "Maduwa");

        List<Student> students = new ArrayList<>();
        //Need to create the student objects using the name array list
        for (String name : names) {
            students.add(new Student(name));
        }
        System.out.println("Using for loop: ");
        students.forEach(System.out::println);

        List<Student> students1 = new ArrayList<>();
        //Use stream to create the student objects using the name array list
        students1 = names.stream().map(name -> new Student(name)).toList();
        System.out.println("Using stream: ");
        students1.forEach(System.out::println);

        //Use constructor reference to create the student objects using the name array list
        List<Student> students2 = names.stream().map(Student::new).toList();
        System.out.println("Using constructor reference: ");
        students2.forEach(System.out::println);
    }
}

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
