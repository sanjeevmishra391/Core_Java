interface A {
    interface NestedInterface {
        boolean isNonNegative(int x);
    }

    boolean isEven(int x);
}

class B implements A.NestedInterface {
    public boolean isNonNegative(int x) {
        return x < 0 ? false : true;
    }

    public boolean isEven(int x) {
        return x % 2 == 0 ? true : false;
    }
}

public class Class14_4 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.isNonNegative(7));
        System.out.println(b.isEven(6));
    }
}
