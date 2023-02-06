// implementing runnable interface

class NewThread implements Runnable {
    Thread t;

    NewThread(String name) {
        t = new Thread(this, name);
        System.out.println("Child thread: " + t);
    }

    void startTheThread() {
        t.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Child thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Class21_5 {
    public static void main(String[] args) {
        NewThread obj = new NewThread("Second thread");
        obj.startTheThread();

        try {
            for (int i = 10; i < 20; i++) {
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
