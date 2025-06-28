@FunctionalInterface
interface MyFunctionalInterface {
    void show();
}

@FunctionalInterface
interface MyFunctionalInterface1 {
    void show(int i);
}

@FunctionalInterface
interface MyFunctionalInterface2 {
    void show(int i, int j);
}

@FunctionalInterface
interface MyFunctionalInterface3 {
    int add(int i, int j);
}

@FunctionalInterface
interface MyFunctionalInterface4 {
    String print(int i, String s);
}

class TestFunctionalInterface implements MyFunctionalInterface {
    public void show() {
        System.out.println("in class show");
    }
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        //Use concrete class to implement functional interface
        TestFunctionalInterface tfi = new TestFunctionalInterface();
        tfi.show();

        //Use anonymous inner class to implement functional interface
        MyFunctionalInterface mfi = new MyFunctionalInterface() {
            public void show() {
                System.out.println("in anonymous inner show");
            }
        };
        mfi.show();

        //Use lambda expression to implement functional interface
        MyFunctionalInterface mfi1 = () -> {
                System.out.println("lambda show");
        };
        mfi1.show();

        //If we have only one line of code in lambda expression then we don't need to use curly braces
        MyFunctionalInterface mfi2 = () -> System.out.println("lambda show with single statement");
        mfi2.show();

        //For multiple lines of code in lambda expression we need to use curly braces
        MyFunctionalInterface mfi3 = () -> {
            String val = "lambda show with multiple statements";
            System.out.println(val);
        };
        mfi3.show();

        //use lambda expression with parameter
        MyFunctionalInterface1 mfi11 = (int i) -> System.out.println("lambda show with parameter " + i);
        mfi11.show(10);

        //use lambda expression with multiple parameters
        MyFunctionalInterface2 mfi21 = (int i, int j) -> System.out.println("lambda show with multiple parameters " + i + " and " + j);
        mfi21.show(10, 20);

        //No need to specify the type of the variable
        MyFunctionalInterface2 mfi22 = (i, j) -> System.out.println("lambda show without specifying the type of the parameters " + i + " and " + j);
        mfi22.show(10, 20);

        //No need to indicate the type of the variable and () if we have only one variable
        MyFunctionalInterface1 mfi12 = i -> System.out.println("lambda show without specifying the type of the parameter and round brackets " + i);
        mfi12.show(10);

        //Use anonymous inner class to implement functional interface with return type
        MyFunctionalInterface3 mfi31 = new MyFunctionalInterface3() {
            public int add(int i, int j) {
                return i + j;
            }
        };
        System.out.println(mfi31.add(10, 20));

        //Use lambda expression to implement functional interface with return type with multiple lines
        MyFunctionalInterface3 mfi32 = (int i, int j) -> {
            int sum = i + j;
            return sum;
        };
        System.out.println(mfi32.add(20, 30));

        //Use lambda expression to implement functional interface with return type with single line
        MyFunctionalInterface3 mfi33 = (int i, int j) -> i + j;
        System.out.println(mfi33.add(30, 40));

        //No need to specify the type of the variable
        MyFunctionalInterface3 mfi34 = (i, j) -> i + j;
        System.out.println(mfi34.add(40, 50));

        MyFunctionalInterface4 mfi41 = (i, s) -> "lambda show with multiple parameters " + i + " and " + s;
        System.out.println(mfi41.print(10, "Hello"));

    }
}
