@FunctionalInterface
interface MyFunctionalInterface {
    void show();
}

class TestFunctionalInterface implements MyFunctionalInterface {
    public void show() {
        System.out.println("in class show");
    }
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        //Use annonymous inner class to implement functional interface
        MyFunctionalInterface mfi = new MyFunctionalInterface() {
            public void show() {
                System.out.println("in anonymous inner show");
            }
        };
        mfi.show();

        //Use concrete class to implement functional interface
        TestFunctionalInterface tfi = new TestFunctionalInterface();
        tfi.show();
    }
}
