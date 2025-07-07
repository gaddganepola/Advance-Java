class C3 implements Runnable{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class C4 implements Runnable{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadsWithRunnable {
    public static void main(String[] args) {
        //Can use both interface abd class reference
        Runnable c3 = new C3();
        C4 c4 = new C4();
        //Create separate threads
        Thread t1 = new Thread(c3);
        Thread t2 = new Thread(c4);
        //Access thread methods
        t1.start();
        t2.start();

    }
}
