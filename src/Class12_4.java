// method overriding

// 3. super keyword is also used to call parent class method
// when child class also has a method with the same name;

class Animal {
    String name, category;

    Animal(String n, String category) {
        this.name = n;
        this.category = category;
    }

    // animal_run
    void run() {
        System.out.println(name + " is running.");
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String category, String b) {
        super(name, category);
        breed = b;
    }

    // dog_run
    void run() {
        System.out.println(name + " of " + breed + " breed is running.");
    }

    void executeRun() {
        run(); // calls the method in Dog class
        super.run(); // calls the method in Animal class
    }
}

class Class12_4 {
    public static void main(String[] args) {
        Animal animal = new Animal("Chimp", "Monkey");

        Dog dog = new Dog("Tommy", "Dog", "labrador");

        // animal.run();
        // dog.run();
        // dog.executeRun();

        // parent class reference can also store the object of child class
        animal = dog;

        animal.run(); // calls the method in Dog class

        // System.out.println(animal.breed); !Error
        System.out.println(dog.breed);

        System.out.println(animal.name);
        System.out.println(dog.name);
    }
}
