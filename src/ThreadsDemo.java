class C1 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
            //Optimize by using sleep
            try {
                Thread.sleep(11);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class C2 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadsDemo {
    public static void main(String[] args) {
        C1 c1 = new C1();
        C2 c2 = new C2();
        //Get the thread priority
        System.out.println(c1.getPriority());
        System.out.println(c2.getPriority());
        //Set the thread priority
//        c1.setPriority(10);
//        c2.setPriority(1);
//        c2.setPriority(Thread.MAX_PRIORITY);

        c1.start();
        c2.start();
    }
}
