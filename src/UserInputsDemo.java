import java.io.IOException;

public class UserInputsDemo {
    public static void main(String[] args) {

        int num = 0;
        System.out.println("Enter a number: ");
        try {
            //Returns the ASCII value of a single character
            num = System.in.read();
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println(num - 48);
    }
}
