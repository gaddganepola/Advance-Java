class A {
    int age;

    public void show() {
        System.out.println("In show");
    }

    class B {
        public void config() {
            System.out.println("In config");
        }
    }
}

class AEnhanced {
    int age;

    public void show() {
        System.out.println("In show");
    }

    static class BEnhanced {
        public void config() {
            System.out.println("In enhanced config");
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {

        A objb = new A();
        objb.show();

        A.B obj = objb.new B();
        obj.config();

        AEnhanced.BEnhanced obj1 = new AEnhanced.BEnhanced();
        obj1.config();
    }
}
