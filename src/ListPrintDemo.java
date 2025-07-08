import java.util.Arrays;
import java.util.List;

public class ListPrintDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 22, 53, 18, 95, 33, 42, 51, 27, 11, 13, 41, 28, 56, 71, 98, 75, 58, 88, 57);

        //Print using for loop
        System.out.println("Use for loop: ");
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");
        }

        //Print using foreach loop
        System.out.println("\nUse enhanced for loop: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        System.out.println("\nUse forEach method: ");
        nums.forEach(n -> System.out.print(n + " "));
    }
}
