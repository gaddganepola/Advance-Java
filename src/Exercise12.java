/*
Mastering Java Collections: Organize, Store, and Sort with List, Set, Map, and Comparators
Working with Collections in Java: Remove Duplicates and Display in Order

Instructions:
You are provided with a list of names in the starter file. Your task is to:

Use the given list of names stored in a List<String>.

Remove duplicates using a Set.

Print the original list and the list after removing duplicates.



Expected Output (order may vary for Set):

  Original List:  [Alice, Bob, Alice, David, Bob]

  Unique Names:  [Alice, Bob, David]
*/

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Exercise12 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Alice", "David", "Bob");

        System.out.println("Original List: " + names);

        Set<String> set = new LinkedHashSet<>(names);

        System.out.println("Unique Names: " + set);
    }
}
