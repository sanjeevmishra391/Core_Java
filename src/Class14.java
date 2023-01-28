// 6. Abstract class can have constructor, static methods and final methods

abstract class Bike {

    String color;

    Bike(String c) {
        color = c;
        System.out.println("Bike constructor");
    }

    abstract void run();

    abstract void changeGear();

    void applyBreak() {
        System.out.println("Brake is applied");
    }

    static void loadSystem() {
        System.out.println("System has loaded.");
    }

    final void stopSystem() {
        System.out.println("System is stopping.");
    }
}

class Honda extends Bike {

    Honda(String color) {
        super(color);
    }

    void run() {
        System.out.println("Honda bike is running.");
    }

    void changeGear() {
        System.out.println("Gear has changed");
    }

    // void stopSystem() {
    // }
}

class Class14 {
    public static void main(String[] args) {
        // cannot create objectof abstract classes.
        // Bike b = new Bike();

        Bike h = new Honda("Red");
        h.run();
        h.applyBreak();
        h.stopSystem();

        System.out.println("Color of the bike is " + h.color);

        Bike.loadSystem();
        Honda.loadSystem();
    }
}
