import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

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
        System.out.println("HashSet output:");
        for (int i : set) {
            System.out.println(i);
        }

        //To print the values in sorted order
        Set<Integer> set1 = new TreeSet<Integer>();
        set1.add(11);
        set1.add(28);
        set1.add(61);
        set1.add(54);
        set1.add(81);
        System.out.println(set1);
        //Use for loop to print the values in sorted order
        System.out.println("TreeSet output:");
        for (int i : set1) {
            System.out.println(i);
        }
        //Use Iterator to print the values in sorted order
        Iterator<Integer> itr = set1.iterator();
        System.out.println("TreeSet output with Iterator:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
