import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInputsDemo {
    public static void main(String[] args) {

        int num = 0;
        System.out.println("Enter a number: ");
        try {
            //Returns the ASCII value of a single character
            num = System.in.read();
            // Clear the buffer after System.in.read()
            while (System.in.read() != '\n');
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("The value from input stream: " + (num - 48));

        //Use BufferedReader to get user inputs
        System.out.println("Enter a number: ");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        int i = 0;
        try {
            i = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("The value from BufferedReader: " + i);

        //Use Scanner to get user inputs
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        System.out.println("The value from Scanner: " + j);
    }
}
