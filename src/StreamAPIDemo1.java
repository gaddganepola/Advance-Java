import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPIDemo1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 22, 53, 18, 95, 33, 42, 51, 27, 11, 13, 41, 28, 56, 71, 98, 75, 58, 88, 57);

        Predicate<Integer> pre = new Predicate<Integer>() {

            @Override
            public boolean test(Integer n) {
                if (n % 2 == 0){
                    return true;
                }else {
                    return false;
                }
            }
        };
        //Optimized by lambda expression
        Predicate<Integer> preex = n -> n % 2 == 0;

        Function<Integer, Integer> fun = new Function<Integer, Integer>() {

            @Override
            public Integer apply(Integer n) {
                return n * 2;
            }
        };
        //Optimized by lambda expression
        Function<Integer, Integer> funex = n -> n * 2;

        int result1 = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0,(n1, n2) -> n1 + n2);

        System.out.println(result1);

        Stream<Integer> s = nums.stream()
                .filter(n -> n % 2 == 0)
                .sorted();
        System.out.println("\nSorted stream: ");
        s.forEach(n -> System.out.print(n + " "));

    }
}
