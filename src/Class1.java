// data types, variables, escape sequence, type conversion and arrays.

public class Class1 {
    public static void main(String[] args) {
        // data type:
        // int, float, double, char, boolean, byte, short, long

        // Integer: byte, short, int, long
        // Floating-point numbers: float, double
        // Characters: char
        // Boolean: boolean

        // byte: 1 byte (8 bits) (2^8 == 256) -> [-128 to 127]
        // short: 2 bytes (16 bits) -> [-32768 to 32767]
        // int: 4 bytes (32 bits)
        // long: 8 bytes (64 bits)

        /*
         * Trying to exceed the limit
         * short upper = (short) 32769; // 32767 - 32769 = -2
         * System.out.println(upper);
         */

        byte data_byte = 5;
        short data_short = 9;
        int data_int = 15;
        long data_long = 19L;

        System.out.println(data_byte + " " + data_short + " " + data_int + " " +
                data_long);

        // declaration and initialization
        int lightspeed; // declaration

        lightspeed = 186000; // initialization

        long days, seconds, distance;

        days = 1000;
        seconds = 24 * 60 * 60 * days;
        distance = lightspeed * seconds;

        System.out.println("Distance travelled by light in " + days + "days = " + distance);

        // float: 4 bytes (32 bits) [1.4e-45, 3.4e+38]
        // double: 8 bytes (64 bits)
        double pi, r = 10.8, a;
        pi = 3.1416;
        a = pi * r * r;
        System.out.println("Area of the circle is " + a);

        // char: 2 bytes (16 bits) [0, 65536]
        // unicode
        /*
         * ascii
         * {[0-9] -> [48, 57]},
         * {[A-Z] -> [65, 90]},
         * {[a-z] -> [97, 122]}
         */

        char ch1, ch2, ch3, ch4;
        ch1 = 'q';
        ch2 = 65;
        ch3 = 65 + 3;
        ch4 = 129;
        System.out.println(ch1);
        System.out.println(ch2); // 65 or A or error
        System.out.println(ch3);
        System.out.println(ch4); // error or garbage value

        // boolean: true(on, 1) and false(off, 0)
        boolean positive = false;
        System.out.println(positive);

        // Escape Sequence;
        // \" prints "
        // \' prints '
        // \\ prints \
        // \n moves the cursor to the next line
        // \f, \t, \b, \r
        System.out.println("\"");
        System.out.println("\'");
        System.out.println("\n");
        System.out.println("\\");

        // variables: container for the data storage.
        // variables can only contain alphabets(A-Z, a-z), numbers(0-9) and
        // underscore(_);
        // variable name cannot start with numbers.
        int Ab_35 = 6; // valid
        int _a648 = 6;
        // int 5asnf = 10;

        // type conversion
        // 1. Automatic type conversion:
        byte data1 = 5;
        int data2 = data1;
        System.out.println("Data2(int): " + data2);

        byte data3 = (byte) data2;
        System.out.println("Data3(byte): " + data3);

        /*
         * if you exceed the range of data ttype you will get garbage value
         * (sometimes calculated in cyclic form)
         */
        int biggerValue = 200;
        byte shorterValue = (byte) biggerValue;
        System.out.println(shorterValue);
        // [-128, 127]
        // 200 - 127 = 73
        // -128 + 73 - 1 = -56

        float floatData = 56.8f;
        int intData = (int) floatData;
        System.out.println("Interger data: " + intData);

        // char to float ? -> Possible
        char charData = 'A'; // ASCII: 65
        float charToFloat = charData;
        System.out.println(charToFloat);

        // byte and short are converted to int when used in mathematical expression.
        byte b = 50;
        // b = b*2; Error, can't convert int to byte
        b = (byte) (b * 2);

        // ------------------- Array -----------------------
        /*
         * Array is a group of like-typed(same data type) variables that are stored in
         * the continuous manner in the memory.
         */

        // data_type variable [] = new data_type[size];

        int months[] = new int[12];
        // index is the location of data in array
        months[0] = 31;
        months[1] = 28;

        System.out.println("Data at 1st index(2nd location) of array: " + months[1]);
    }
}
