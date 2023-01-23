// OOPs: (Object oriented programming):

// classes and objects.

/* 4 principles:
 1. Abstraction: data hiding and showing only necessary details.
 2. Encapsulation: data and method binding, using classes/objects
 3. Inheritance: inheriting the properties from parent class to child class
 4. Polymorphism: "many forms"
*/

/*
 * Inheritance: 
 * superclass (also a base class or a parent class)
 * subclass (also a derived class, extended class, or child class)
 * extends keyword
 */

class A {
    int x = 5;

    void printA() {
        System.out.println("In the function of class A.");
        x = x + 20;
    }
}

// B is child class and A is parent class
class B extends A {
    void printB() {
        System.out.println("In the function of class B.");

        printA();

        System.out.println("x = " + x);

        x = x * 2;

        System.out.println("x = " + x);
    }
}

public class Class11 {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();

        objA.printA(); // x_A = 25

        System.out.println();

        objB.printB(); // x_B = 50;

        System.out.println();

        objB.printA(); // x_B = 70

        System.out.println(objA.x); // 25
        System.out.println(objB.x); // 70

        objA.x = 7;

        System.out.println(objA.x); // 7
        System.out.println(objB.x); // 70
    }
}
