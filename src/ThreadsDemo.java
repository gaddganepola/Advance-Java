class C1 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
        }
    }
}
class C2 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
        }
    }
}
public class ThreadsDemo {
    public static void main(String[] args) {
        C1 c1 = new C1();
        C2 c2 = new C2();
        c1.start();
        c2.start();
    }
}
