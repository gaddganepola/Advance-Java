import java.util.ArrayList;
import java.util.Collection;

public class ArrayListDemo {
    public static void main(String[] args) {
        //Create ArrayList
        Collection nums = new ArrayList();
        //Add elements
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        //Directly print
        System.out.println(nums);
        //Use for loop to print
        for (Object i : nums) {
            int num = (int) i;
            System.out.println(num * 2);
        }
        //Remove element
        nums.remove(10);
        //Get the count of the elements
        System.out.println("Count: " + nums.stream().count());
        //Clear the ArrayList
        nums.clear();
        System.out.println(nums);

        //Use generic ArrayList
        Collection<Integer> nums1 = new ArrayList<Integer>();
        nums1.add(1);
        nums1.add(2);
        nums1.add(3);
        nums1.add(4);
        nums1.add(5);

        for (Integer i : nums1) {
            System.out.println(i);
        }

    }
}
