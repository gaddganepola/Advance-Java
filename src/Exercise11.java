/*
Java Multithreading in Action: Managing Threads, Priorities, and Race Conditions
Create a Java program that launches two threads, each printing a simple message five times.

You need to:

Create a class PrinterTask that implements Runnable.

In the run() method, print:

[Thread-Name]: Running task i
for i = 1 to 5.

In the main() method:

Instantiate PrinterTask once.

Create two Thread objects using this task, named "Worker-1" and "Worker-2".

Start both threads.

Use .join() to ensure the main thread waits for both to finish.

Expected Output (order may vary):

  Worker-1: Running task 1

  Worker-2: Running task 1

  Worker-1: Running task 2

  Worker-2: Running task 2

  ...
*/

class PrinterTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": Running task " + i);
        }
    }
}

public class Exercise11 {
    public static void main(String[] args) {

        PrinterTask task = new PrinterTask();
        Thread worker_1 = new Thread(task, "Worker-1");
        Thread worker_2 = new Thread(task, "Worker-2");
        worker_1.setPriority(Thread.MAX_PRIORITY);
        worker_1.start();
        worker_2.start();

        try {
            worker_1.join();
            worker_2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
