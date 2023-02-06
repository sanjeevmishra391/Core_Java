// Multithreading:
// it allows concurrent execution of two or more parts of a program
// it helps in maximum utilization of CPU, makes the program faster, 

// each part of program is called thread.
// threads: light-weight processes inside a process.

// Difference between threads and processes?

// There are two ways of utilising multithreading in java
// 1. Extending the Thread class
// 2. Implementing the Runnable interface

public class Class21_4 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Current thread: " + t);

        t.setName("My thread");

        System.out.println("Current thread: " + t);

        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(5000); // this sleeps the thread for n milliseconds
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}

// Thread[My thread,5,main] : name of thread, priority, group to which thread
// belongs