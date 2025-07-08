import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultSortingDemo {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(17);
        nums.add(80);
        nums.add(43);
        nums.add(29);
        nums.add(35);

        System.out.println("Before sorting: ");
        for (Integer num : nums) {
            System.out.print(num + " ");
        }
        //Sort list using Collections class
        Collections.sort(nums);

        System.out.println("\nAfter sorting: ");
        for (Integer num : nums) {
            System.out.print(num + " ");
        }
    }
}
