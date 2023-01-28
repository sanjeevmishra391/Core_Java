// abstract class and abstract methods.

// 1. Abstract methods do not contain body.
// 2. If any class contains abstract method then you have to make class as abstract.
// 3. You can not make objects of abstract class.
// 4. Abstract class can contain non-abstract methods as well.
// 5. Any class that inherits abstract class needs to either provide body of all abstract methods 
//    or make the class as abstract.
// 6. Abstract class can have constructor, static methods and final methods

abstract class A {
    abstract void callMe();

    abstract void printSomething();

    void anotherMethod() {
        System.out.println("In the another method");
    }
}

abstract class B extends A {

    // abstract void anotherOne();

    void callMe() {
        System.out.println("B's implementation of callMe method");
    }

    // void printSomething() {
    // System.out.println("Printing something");
    // }
}

class C extends B {

    // void callMe() {
    // System.out.println("C's implementation of callMe method");
    // }

    void printSomething() {
        System.out.println("Printing something");
    }
}

public class Class13_3 {
    public static void main(String[] args) {

        // A objA = new A(); Error

        A a = new C();
        a.callMe();
        a.anotherMethod();
        a.printSomething();
    }
}
