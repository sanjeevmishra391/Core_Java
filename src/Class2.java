// arrays, string(intro) and operators.

public class Class2 {
    public static void main(String[] args) {
        // --------- Array ---------------
        /*
         * Array is a group of like-typed(same data type) variables that are stored in
         * the continuous manner in the memory.
         */

        // data_type array_name[] = new data_type[size_of_array];
        // size_of_array should be positive;
        int int_arr[] = new int[5]; // size(int) = 4 bytes, size of array = 4 * 5 = 20 bytes
        int[] arr = new int[5];

        int[] x, y, z;
        x = new int[8];
        y = new int[9];
        z = new int[10];
        // indexing: is the location of data in array.
        // index should be in the range [0, size_of_array-1]
        // System.out.println(int_arr[-1]); !Error
        // System.out.println(int_arr[5]); !Error

        // default value: int, byte, short, long it is 0, boolean it is false, float,
        // double it is 0.0
        System.out.println("Default value: " + int_arr[3]);

        int_arr[1] = 10;
        System.out.println(int_arr[0]);
        System.out.println(int_arr[1]);

        // size of the array
        System.out.println("Size of the array : " + int_arr.length);

        // array initialization
        int months[] = { 31, 28, 31, 30, 31, 30 };
        // System.out.println(months[0]);

        // for loop
        for (int i = 0; i < 6; i = i + 1) {
            System.out.println(months[i]);
        }

        System.out.println("Loop has ended");
        // i=0, months[0], increment i (1), check condition (1<6)
        // i=1, months[1], increment i (2), check condition (2<6)
        // i=2, months[2], increment i (3), check condition (3<6)
        // i=3, months[3], increment i (4), check condition (4<6)
        // i=4, months[4], increment i (5), check condition (5<6)
        // i=5, months[5], increment i (6), check condition (6<6) -> false

        // -------------- Multidimensional Array -----------------
        // Array of arrays.
        int two_dimensional[][] = new int[2][3];
        int row_number = 1;
        int col_number = 2;
        two_dimensional[row_number][col_number] = 6;
        System.out.println(two_dimensional[row_number][col_number]);
        System.out.println("Default value : " + two_dimensional[0][2]);
        two_dimensional[0][2] = 10;
        System.out.println("New value: " + two_dimensional[0][2]);

        // 2x2 -> two rows, two cols
        int two_dimensional_initialized[][] = { { 1, 2 }, { 3, 4 } };
        System.out.println(two_dimensional_initialized[0][1]);

        // another way of array creation
        int two_dim[][] = new int[3][];
        two_dim[0] = new int[5];
        two_dim[1] = new int[5];
        two_dim[2] = new int[5];
        // above declaration is equivalent to : int two_dim2[][] = new int[3][5];

        System.out.println("Number of Rows of two dimensional array: " + two_dim.length);
        System.out.println("Number of Cols of two dimensional array: " + two_dim[0].length);

        // String: are not primitive, nor it is char array
        // are objects
        String firstName = "Sanjeev";
        String lastName = "Mishra";
        String fullName = firstName + " " + lastName + 5;
        System.out.println(fullName); // Sanjeev Mishra5
        // char ch = 'A';

        // ------------- operators ---------------

        /*
         * Arithematic operators: +(addition), -(subtraction), *(multiplication),
         * /(division), %(modulus, remainder)
         */

        int a = 8;
        int b = 2;
        int c = 3;
        int result = a / c; // 2;
        float result_float_1 = (float) a / c; // 2.66667, a is converted to float.
        float result_float_2 = (float) (a / c); // 2.0
        System.out.println(a / b); // 4
        System.out.println(result + " " + result_float_1 + " " + result_float_2);
    }

}
