// call by value and call by reference

/*
 * There are two ways of passing arguments:
 * 1. call by value: a copy is created and changes to copy does not affect original data. all the primitive data types
 * 2. call by reference: a reference to the data is sent. 
 * and changes made using reference affect original data. Objects and arrays
 */

class Test {

    int len = 5;

    int callByValue(int x) {
        System.out.println("x = " + x);

        x = x * 2;

        System.out.println("modified x = " + x);

        return x;
    }

    void callByReference(Test t) {
        System.out.println("Len = " + t.len);

        t.len = t.len * 10;

        System.out.println("Modified len = " + t.len);
    }
}

public class Class9_2 {
    public static void main(String[] args) {
        Test t1 = new Test();

        // call by value
        int a = 35;
        int newA = t1.callByValue(a);

        System.out.println("a = " + a);
        System.out.println("newA = " + newA);

        // call by reference
        Test t2 = new Test();

        System.out.println("Before calling method, Len = " + t2.len);

        t1.callByReference(t2);

        System.out.println("After calling method, Len = " + t2.len);
    }
}
