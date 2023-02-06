class NewThread extends Thread {

    NewThread(String name) {
        super(name);
        System.out.println("Demo thread: " + this);
        start();
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

public class Class21_6 {
    public static void main(String[] args) {
        NewThread t = new NewThread("Demo thread");
    }
}
