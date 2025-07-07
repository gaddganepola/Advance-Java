class Counter {
    int count;
    //Make the count variable thread safe
    public synchronized void increment() {
        count++;
    }
}
public class RaceConditionDemo {
    public static void main(String[] args) {
        //Create an object of class Counter
        Counter c = new Counter();
        //Use lambda expression to create threads using Runnable interface
        Runnable r1 = () -> {
            for (int i = 0; i < 10000; i++) {
                c.increment();
            }
        };
        Runnable r2 = () -> {
            for (int i = 0; i < 10000; i++) {
                c.increment();
            }
        };
        //Create threads to execute the thread methods on runnable objects
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        //Start threads
        t1.start();
        t2.start();
        //Join threads, wait until both threads finished their execution
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Get the value of the count variable
        System.out.println(c.count);
    }
}
