
// private members can only be accessed in the same class but not outside, not even subclasses.

class A {
    int i, j;
    private String className = "A";

    void showij() {
        System.out.println("i = " + i + ", j = " + j);
    }

    private void printClassName() {
        System.out.println(className);
    }
}

class B extends A {
    int k;

    void showk() {
        System.out.println("k = " + k);
    }

    void sum() {
        System.out.println("sum of i, j, and k = " + (i + j + k));
    }
}

class Class11_2 {
    public static void main(String[] args) {
        A objA = new A();
        objA.i = 5;
        objA.j = 10;

        B objB = new B();
        objB.k = 20;

        objA.showij();
        objB.showij();

        // objB.printClassName(); !Error
        // objA.printClassName(); !Error

        objB.showk();
        // objA.showk(); !Error

        // objA.sum(); !Error
        objB.sum();
    }
}
