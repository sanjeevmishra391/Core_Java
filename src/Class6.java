// class, methods, parameterized methods, objects, reference variable
// access instance variables and methods using objects
// constructors, parameterized constructors
// pass multiple inputs to methods and get output

class Box {
    // instance variables
    String name;
    int length, width, height;

    // constructor : used to instialize the instance variable
    // or perform something when object is created.
    // has the same name as class
    // it does not return any value, not even void
    Box(String n, int l, int w, int h) {
        System.out.println(n + " object is created");
        System.out.println("Length = " + l);
        System.out.println("Width = " + w);
        System.out.println("Height = " + h);
        length = l;
        width = w;
        height = h;
        name = n;
    }

    // if function does not return anything then return type is void.
    void getVolume() {
        int volume = length * width * height;
        System.out.println("Volume of Box  = " + volume);
    }

    // square
    int square(int x) {
        // System.out.println("Inside square function");
        return (x * x);
    }

    // function : add, take two inputs and add those values and return the result.
    int add(int x, int y) {
        return x + y;
    }
}

class Class6 {

    public static void main(String[] args) {
        // myBox1
        Box myBox1; // null reference variable
        myBox1 = new Box("Cuboid", 5, 10, 20); // it stores the memory of object;

        myBox1.getVolume();
        // myBox1.length = 5;
        // myBox1.width = 10;
        // myBox1.height = 20;

        // mbBox2
        // Box myBox2 = new Box();
        // myBox2.length = 6;
        // myBox2.width = 12;
        // myBox2.height = 2;

        Box myBox2 = myBox1;
        // myBox2 = myBox1;

        myBox2.length = 9;
        myBox2.width = 12;
        myBox2.height = 4;

        System.out.println(myBox1.length);
        System.out.println(myBox2.length);

        myBox1.getVolume();
        myBox2.getVolume();

        int result1 = myBox1.square(3);
        int result2 = myBox2.square(9);

        System.out.println("Result1 = " + result1);
        System.out.println("Result2 = " + result2);

        myBox2 = null;

        Box myBox3 = new Box("MyBox", 5, 8, 11);
        // myBox3.length = 5;
        // myBox3.width = 8;
        // myBox3.height = 11;

        System.out.println(myBox3.square(4));

        Box myBox4 = new Box("Cube", 5, 5, 5);

        int add_result = myBox4.add(3, 4);
        System.out.println("Add result = " + add_result);

        // create three object reference variables and myBox1, myBox2, myBox3.
        // myBox2 will access the same object as myBox1 and myBox3 will be a new object.
        // store some data and find the volume.

    }
}

// create a Student class. and two instance variables : name, roll_number.
// use constructor to initialise objects.
// create a function to print the details of the student.