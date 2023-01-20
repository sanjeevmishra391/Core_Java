// method overloading, contructor overloading, objects as parameters and return 

/*
 * Method overloading : In the same class, multiple methods can share the same name,
 * as long as their parameter declaration is different.
 * Number of paramters and/or the type of parameter are different
 */

/*
 * Constructor overloading : In the same class, we can have multiple constructors,
 * as long as their parameter declaration is different.
 */

// Every object has a data type and it is it's own class.

/*
 * There are two ways of passing arguments:
 * 1. call by value: a copy is created and changes to copy does not affect original data. all the primitive data types
 * 2. call by reference: a reference to the data is send. 
 * and changes made using reference affect original data. Objects and arrays
 */

// you can also return objects from functions

class OverloadClass {

    int length, width, height;

    // constructor 1
    OverloadClass(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
        System.out.println("In the constructor 1.");
        System.out.println("Length = " + length + ", Width = " + width + ", Height = " + height);
    }

    // constructor 2
    OverloadClass(int a) {
        length = a;
        width = a;
        height = a;
        System.out.println("In the constructor 2.");
        System.out.println("Length = " + length + ", Width = " + width + ", Height = " + height);
    }

    // constructor 3
    OverloadClass() {
        length = -1;
        width = -1;
        height = -1;
        System.out.println("In the constructor 3.");
        System.out.println("Length = " + length + ", Width = " + width + ", Height = " + height);
    }

    // constructor 4
    OverloadClass(double l, double w, double h) {
        length = (int) l;
        width = (int) w;
        height = (int) h;
        System.out.println("In the constructor 4.");
        System.out.println("Length = " + length + ", Width = " + width + ", Height = " + height);
    }

    // constructor 5
    OverloadClass(OverloadClass obj) {
        length = obj.length;
        width = obj.width;
        height = obj.height;
        System.out.println("In the constructor 5.");
        System.out.println("Length = " + length + ", Width = " + width + ", Height = " + height);
    }

    // method 1
    void test() {
        System.out.println("In the test method 1, No parameters.");
    }

    // method 2
    void test(int x) {
        System.out.print("In the test method 2, with parameters: ");
        System.out.println("x = " + x);
        x = x + 2;
        System.out.println("modified x = " + x);
    }

    // method 3
    void test(int x, int y) {
        System.out.print("In the test method 3, with parameters: ");
        System.out.println("x = " + x + ", y = " + y);
        // test(y);
    }

    // method 4
    void test(double x) {
        System.out.print("In the test method 4, with parameters: ");
        System.out.println("x = " + x);
    }

    // method 5, not different method.
    // Error
    // int test(int a) {
    // return 10;
    // }

    // method 6
    int test(float y) {
        System.out.print("In the test method 6, with parameters: ");
        System.out.println("y = " + y);
        return (int) y;
    }

    // method 7
    void test(int x, double y) {
        System.out.print("In the test method 7, with parameters: ");
        System.out.println("x = " + x + ", y = " + y);
    }

    // method 8
    void test(double x, int y) {
        System.out.print("In the test method 8, with parameters: ");
        System.out.println("x = " + x + ", y = " + y);
    }

    int volume() {
        return length * width * height;
    }

    boolean isEqualData(OverloadClass obj) {
        System.out.println("Data of object as parameter: ");
        System.out.println(obj.length);
        System.out.println(obj.width);
        System.out.println(obj.height);

        System.out.println("Data of calling object: ");
        System.out.println(length);
        System.out.println(width);
        System.out.println(height);

        if (length == obj.length && width == obj.width && height == obj.height) {
            return true;
        }

        return false;
    }

    void callByReference(OverloadClass obj) {
        System.out.println("Data of object as parameter: ");
        System.out.println(obj.length);
        System.out.println(obj.width);
        System.out.println(obj.height);

        obj.length = obj.length * 2;
        obj.width *= 2;
        obj.height *= 2;

        System.out.println("Data of object as parameter after modification: ");
        System.out.println(obj.length);
        System.out.println(obj.width);
        System.out.println(obj.height);
    }

    OverloadClass objectReturnFunction(int a) {
        OverloadClass newObj = new OverloadClass(a);

        return newObj;
    }

    // 1. create one method which receives an object as parameter
    // 2. inside the method create a new object with triple times the data
    // 3. return this new object
    OverloadClass createNewObjectTriple(OverloadClass objectTriple) {

        // OverloadClass myObj = new OverloadClass();
        // myObj.length = 3 * objectTriple.length;
        // myObj.width = 3 * objectTriple.width;
        // myObj.height = 3 * objectTriple.height;

        OverloadClass myObj = new OverloadClass(3 * objectTriple.length, 3 * objectTriple.width,
                3 * objectTriple.height);

        return myObj;
    }

}

class Class8 {
    public static void main(String[] args) {
        OverloadClass overloadClassObj = new OverloadClass(10, 12, 14); // constructor 1
        System.out.println(overloadClassObj.volume());

        System.out.println();

        overloadClassObj.test(); // method 1
        int a = 64;
        overloadClassObj.test(a); // method 2
        // a is passed as call by value.
        // in call by value a copy is created.
        // and any changes to the copy is not reflected to original data
        System.out.println("a = " + a);
        overloadClassObj.test(23, 79); // method 3
        overloadClassObj.test(55.1); // method 4
        // int result = overloadClassObj.test(22); error
        int result = overloadClassObj.test(34.8f); // method 6
        System.out.println("Result : " + result);
        overloadClassObj.test(5, 7.8); // method 7
        overloadClassObj.test(4.9, 33); // method 8

        System.out.println();

        OverloadClass overloadClassObj2 = new OverloadClass(5); // constructor 2
        System.out.println(overloadClassObj2.volume());

        System.out.println();

        OverloadClass overloadClassObj3 = new OverloadClass(); // constructor 3
        System.out.println(overloadClassObj3.volume());

        System.out.println();

        OverloadClass overloadClassObj4 = new OverloadClass(10.7, 12.3, 14.4); // constructor 4
        System.out.println(overloadClassObj4.volume());

        System.out.println();

        boolean compareResult = overloadClassObj2.isEqualData(overloadClassObj4);
        System.out.println("overloadClassObj2 == overloadClassObj4 : " + compareResult);

        System.out.println();

        boolean compareResult2 = overloadClassObj4.isEqualData(overloadClassObj2);
        System.out.println("overloadClassObj4 == overloadClassObj2 : " + compareResult2);

        System.out.println();

        System.out
                .println("overloadClassObj == overloadClassObj4 : " + overloadClassObj.isEqualData(overloadClassObj4));

        System.out.println();

        OverloadClass overloadClassObj5 = new OverloadClass(overloadClassObj2); // constructor 5
        System.out.println(overloadClassObj5.volume());

        System.out.println();

        overloadClassObj.callByReference(overloadClassObj4);

        System.out.println("Data of object outside function: ");
        System.out.println(overloadClassObj4.length); // 20
        System.out.println(overloadClassObj4.width); // 24
        System.out.println(overloadClassObj4.height); // 28

        System.out.println();

        OverloadClass returnedObj = overloadClassObj.objectReturnFunction(15);
        System.out.println(returnedObj.length);

        System.out.println();

        OverloadClass tripleReturnedObj = overloadClassObj.createNewObjectTriple(overloadClassObj4);
        System.out.println(tripleReturnedObj.length); // 60
        System.out.println(tripleReturnedObj.width); // 72
        System.out.println(tripleReturnedObj.height); // 84

    }
}
