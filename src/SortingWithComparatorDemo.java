import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingWithComparatorDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(17);
        nums.add(80);
        nums.add(43);
        nums.add(29);
        nums.add(35);

        //Sorting using custom logic
        Comparator<Integer> com = new Comparator<Integer>() {
            //Sort based on the last digit
            @Override
            public int compare(Integer i, Integer j) {
                if (i%10 > j%10) {
                    return 1;
                }else {
                    return -1;
                }
            }
        };

        //Sorting using lambda
        Comparator<Integer> comex = (i, j) -> i%10 > j%10 ? 1 : -1;

        System.out.println("Before sorting: ");
        for (Integer num : nums) {
            System.out.print(num + " ");
        }

        Collections.sort(nums, com);
        System.out.println("\nAfter sorting using custom sort: ");
        for (Integer num : nums) {
            System.out.print(num + " ");
        }

        //Sort String list based on the length of the strings
        List<String> towns = new ArrayList<>();
        towns.add("Colombo");
        towns.add("Galle");
        towns.add("Matara");
        towns.add("Kandy");
        towns.add("Jaffna");
        towns.add("Kurunegala");

        System.out.println("\nBefore sorting towns: ");
        for (String town : towns) {
            System.out.print(town + " ");
        }

        Collections.sort(towns);

        System.out.println("\nAfter default sorting: ");
        for (String town : towns) {
            System.out.print(town + " ");
        }

        Comparator<String> com2 = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() > s2.length()) {
                    return 1;
                }else if (s1.length() < s2.length()) {
                    return -1;
                }else {
                    return s1.compareTo(s2);
                }
            }
        };

        Collections.sort(towns, com2);
        System.out.println("\nAfter sorting using custom sort: ");
        for (String town : towns) {
            System.out.print(town + " ");
        }
    }
}
