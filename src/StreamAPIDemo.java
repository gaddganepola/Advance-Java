import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIDemo {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 22, 53, 18, 95, 33, 42, 51, 27, 11, 13, 41, 28, 56, 71, 98, 75, 58, 88, 57);

        //Create a stream from the list of integers
        Stream<Integer> s1 = nums.stream();
//        s1.forEach(n -> System.out.print(n + " "));
        //Output: 1 22 53 18 95 33 42 51 27 11 13 41 28 56 71 98 75 58 88 57

        //Filter even values
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
//        s2.forEach(n -> System.out.print(n + " "));
        //Output: 22 18 42 28 56 98 58 88

        //Double the filtered values
        Stream<Integer> s3 = s2.map(n -> n * 2);
//        s3.forEach(n -> System.out.print(n + " "));
        //Output: 44 36 84 56 112 196 116 176


        int result = s3.reduce(0, (n1, n2) -> n1 + n2);
        System.out.println(result);

        //Optimized way of writing the above code
        int result1 = nums.stream()
                            .filter(n -> n % 2 == 0)
                            .map(n -> n * 2)
                            .reduce(0,(n1, n2) -> n1 + n2);

        System.out.println(result1);
    }
}
