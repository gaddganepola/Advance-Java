import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        //Create a map using HashMap
        Map<String, Integer> students = new HashMap<>();
        //Add elements to the map
        students.put("Amal", 10);
        students.put("Kamal", 20);
        students.put("Nimal", 30);
        //Print the map
        System.out.println(students);
        //Get the value of a key
        System.out.println("Marks of Amal: " + students.get("Amal"));
        //Fetch the values
        students.values().forEach(System.out::println);

        students.put("Amal", 100);
        students.replace("Kamal", 20, 500);

        students.keySet().forEach(System.out::println);

        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }
    }
}
