import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassDemo {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Amal", "Kamal", "Laxman", "Lakiya", "Maduwa");

        //Find a name that contain some character
        Optional<String> name = names.stream().filter(str -> str.contains("y")).findFirst();
        System.out.println(name.get());

        //Handle null value
        Optional<String> name1 = names.stream().filter(str -> str.contains("r")).findFirst();
        System.out.println(name1.orElse("No name found"));

        String name2 = names.stream().filter(str -> str.contains("y")).findFirst().orElse("No name exists");
        System.out.println(name2);
    }
}
