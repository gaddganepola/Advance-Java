import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Amal", "Kamal", "Laxman", "Lakiya", "Maduwa");

        //Need to convert all the name in to uppercase
        List<String> upperCaseNames = names.stream().map(name -> name.toUpperCase()).toList();
        upperCaseNames.forEach(name -> System.out.println(name));

        //Do the same thing using method reference
        List<String> upperCaseNames1 = names.stream().map(String::toUpperCase).toList();
        upperCaseNames1.forEach(System.out::println);
    }
}
