import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        //Create Set using HashSet
        Set<Integer> set = new HashSet<Integer>();
        //Add elements to the set
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(10);
        //Print the set
        System.out.println(set);
        //Output: [20, 40, 10, 30] - does not print the duplicate elements and order is random
    }
}
