// interfaces.

// 1. It must have only abstract methods but no non-abstract methods.
// 2. Variables in interface are by default static and final.
// 3. A class can implement more than one interface.
// 4. An interface can extend another interface.
// 5. Nested interfaces. An interface can be declared inside another class or interface.

interface Bike {

    String MODEL = "INDIAN";

    abstract void run();

    abstract void changeGear();
}

interface Vehicle {
    abstract void loadVehicle();
}

class HeroHonda {
    void applyBreak() {
        System.out.println("Brake is applied.");
    }
}

class Hero extends HeroHonda implements Bike, Vehicle {
    public void run() {
        System.out.println("Hero bike is running");
    }

    public void changeGear() {
        System.out.println("Gear has changed.");
    }

    public void loadVehicle() {
        System.out.println("Hero bike is loading.");
    }
}

public class Class14_2 {
    public static void main(String[] args) {
        Hero h = new Hero();

        h.loadVehicle();
        h.run();
        h.changeGear();
        h.applyBreak();

        System.out.println(Bike.MODEL);

        // Bike.MODEL = "Non-indian"; !Error
    }
}
