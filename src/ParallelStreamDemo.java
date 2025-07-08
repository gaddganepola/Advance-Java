import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        int size = 100_000;
        List<Integer> nums = new ArrayList<>(size);

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            nums.add(random.nextInt(1000));
        }

        int sum1 = nums.stream()
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);

        long startSequential = System.currentTimeMillis();

        int sum2 = nums.stream()
                .map(n -> {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return n * 2;
                })
                .mapToInt(n -> n)
                .sum();

        long endSequential = System.currentTimeMillis();


        long startParallel = System.currentTimeMillis();

        int sum3 = nums.parallelStream()
                .map(n -> {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return n * 2;
                })
                .mapToInt(n -> n)
                .sum();

        long endParallel = System.currentTimeMillis();

        System.out.println(sum1 + " " + sum2 + " " + sum3);
        System.out.println("Time sequential: " + (endSequential - startSequential));
        System.out.println("Time parallel: " + (endParallel - startParallel));

        //Output: 99753928 99753928 99753928
        //Time sequential: 172965
        //Time parallel: 22380
    }
}
