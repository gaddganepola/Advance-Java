public class ExceptionHandlingTryWithMultipleCatch {
    public static void main(String[] args) {
        int i = 1;
        int j = 0;

        int numbers[] = new int[5];

        String s = null;

        try {
            j = 10 / i;

            System.out.println(numbers[0]);

            System.out.println(s.length());

        }catch(ArithmeticException e) {
            System.out.println("Can not divide by zero");
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Can not exceed the array size");
        }catch(Exception e) {
            System.out.println("Something went wrong");
        }

        System.out.println("End of the execution");

    }
}
