public class CustomException {
    public static void main(String[] args) {
        int i = 100;
        int j = 0;

        try{
            j = 10 / i;
            if (j == 0) {
                throw new MyFirstCustomException("Result can not be zero");
            }
        }catch (MyFirstCustomException e) {
            j = 10 / 1;
            System.out.println("Print default value " + e);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        System.out.println(j);
        System.out.println("End of the execution");
    }
}

class MyFirstCustomException extends Exception {
    public MyFirstCustomException(String message) {
        super(message);
    }
}
