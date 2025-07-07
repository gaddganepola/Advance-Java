public class DuckingExceptionUsingThrows {
    public static void main(String[] args) {

        DuckingException de = new DuckingException();

        try {
            de.show();
        } catch (ClassNotFoundException e) {
            System.out.println("No class available");;
        }

    }
}

class DuckingException {
    public void show() throws ClassNotFoundException {
        Class.forName("abc");
        System.out.println("Class is available");
    }
}