// static block

class A {

    static int x = 5;

    static {
        System.out.println("In the static block");
        // you can access static members only - static variables and static methods
        System.out.println(x);
        run();
    }

    static {
        System.out.println("In the second static block");
    }

    A() {
        System.out.println("In the constructor");
    }

    static void run() {
        System.out.println("Method executed");
    }

}

public class Class13_4 {

    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        System.out.println("In the main method");

        A a = new A();
    }
}