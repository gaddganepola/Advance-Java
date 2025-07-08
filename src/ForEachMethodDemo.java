import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethodDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 22, 53, 18, 95, 33, 42, 51, 27, 11, 13, 41, 28, 56, 71, 98, 75, 58, 88, 57);

        //Create a consumer object
//        Consumer<Integer> con = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer n) {
//                System.out.print(n + " ");
//            }
//        };

        //Since this is a functional interface, we can use lambda expression
        Consumer<Integer> con = n -> System.out.print(n + " ");

        nums.forEach(con);

        System.out.println();

        //We can replace the consumer object with lambda expression
        nums.forEach(n -> System.out.print(n + " "));

    }
}
