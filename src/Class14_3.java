interface Vehicle {
    void run();

    void start();
}

interface Car extends Vehicle {
    void applyBreak();
}

class Maruti implements Car {

    public void start() {
        System.out.println("Maruti started.");
    }

    public void run() {
        System.out.println("Maruti is running.");
    }

    public void applyBreak() {
        System.out.println("Brake is applied");
    }
}

public class Class14_3 {
    public static void main(String[] args) {
        Car m = new Maruti();
        m.start();
        m.run();
        m.applyBreak();
    }
}
