
// multi-level inheritance

// 1. super keyword calls the constructor of the immediate parent. super()
// 2. helps to access instance variable of parent class having same name
// as in child class. super.variable_name

class A {
    int i;

    A(int a) {
        System.out.println("In the constructor of A");
        i = a;
    }
}

class B extends A {
    int j, i;

    B(int a, int b, int c) {
        super(a);
        System.out.println("In the constructor of B");
        j = b;
        i = c;

        System.out.println("Class B, i = " + i);
        System.out.println("Class C, i = " + super.i);

        super.i = 2 * super.i;

        System.out.println("After modification");
        System.out.println("Class B, i = " + i);
        System.out.println("Class C, i = " + super.i);
    }
}

// class C extends B {
// C(int a, int b) {
// super(a, b);
// System.out.println("In the constructor of C");
// }
// }

public class Class12_2 {
    public static void main(String[] args) {
        // A objA = new A(9);
        B objB = new B(5, 10, 60);
        // C objC = new C(8, 2);

        // System.out.println(objA.i); // 9
        // System.out.println(objB.i); // 5
        // System.out.println(objC.i); // 8

        // // System.out.println(objA.j); !Error
        // System.out.println(objB.j); // 10
        // System.out.println(objC.j); // 2

        // objB.i = 20;

        // System.out.println(objA.i); // 9
        // System.out.println(objB.i); // 20
        // System.out.println(objC.i); // 8
    }
}
