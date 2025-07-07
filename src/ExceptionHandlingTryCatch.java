public class ExceptionHandlingTryCatch {
    public static void main(String[] args) {

        int i = 0; //Normal Statement
        //int j = 10 / i; Critical Statement

        int j = 0;

        try{
            j = 10 / i;
        } catch(Exception e) {
            System.out.println();
        }

        System.out.println(j);
        System.out.println("End of the execution");
    }
}
