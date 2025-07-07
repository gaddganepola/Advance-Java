import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) throws IOException {
        int num = 0;
        BufferedReader br = null;
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(in);
            //Using single line
            //br = new BufferedReader(br = new BufferedReader(in));
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            br.close();
        }
    }
}
