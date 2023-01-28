// operators and practice questions

// prefix: change the value and then use it
// postfix: use the value and then change it

public class Class3 {
    public static void main(String[] args) {
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

        // % (modulus) : it is used for finding the remainder
        int mod_result = a % b; // 8/2 = 4, rem = 0
        int mod_result2 = a % c; // 8/3 = 2, rem = 2
        System.out.println("Mod result1: " + mod_result);
        System.out.println("Mod result2: " + mod_result2);

        float d = 4.6f;
        int mod_float_result = (int) d % b;
        System.out.println("Mod float result: " + mod_float_result);

        /*
         * Unary operator
         * op++, op-- (Postfix), ++op, --op (prefix), ! (not operator)
         */
        int e = 3;
        e++; // e = e + 1
        System.out.println("e++ : " + e); // 4
        e--; // e = e - 1
        System.out.println("e-- : " + e); // 3
        ++e; // e = e + 1
        System.out.println("++e : " + e); // 4
        --e; // e = e - 1
        System.out.println("--e : " + e); // 3

        int res = a + e++;
        System.out.println("Res: " + res + " and e: " + e);
        e = 3;
        res = a + ++e;
        System.out.println("Res: " + res + " and e: " + e);

        // e = 4
        int unary_result = e++ + ++e; // 4 + 6
        System.out.println("Unary result: " + unary_result + " and e: " + e);
        e = -e;
        // not operator: inverts the boolean value
        // changes true to false and false to true
        boolean water_is_flowing = true;
        water_is_flowing = !water_is_flowing;
        System.out.println(water_is_flowing);

        // binary numbers
        // 5 -> 101, 1001 -> 9
        /*
         * bitwise operators:
         * >>(right shift), <<(left shift), &(bitwise AND), ^(bitwise XOR),
         * |(bitwise OR)
         */
        // 1001 (9) >> 1 : 0100 (9/2 == 4), division by 2 and result is in integer
        // way to store binary number
        int g = 0b1001;
        System.out.println("Binary number : " + g);

        int f = 9;
        f = f >> 1;
        System.out.println("Right shift result: " + f);

        // // 1000 1000 (-8) >> 1 : 1100 0100 ( )
        // int neg = -8;
        // neg = neg >> 1;
        // System.out.println("Negative right shift result: " + neg);
        // // unsigned right shift
        // int neg_unsigned = -8;
        // neg_unsigned = neg_unsigned >> 1;
        // System.out.println("Negative unsigned right shift result: " + neg_unsigned);

        // 100 (4) << 1 : 1000 (4*2 == 8), multiplication by 2.
        int h = 4;
        h = h << 1;
        System.out.println("Left shift result: " + h);

        int i = 6, j = 5; // 0b110 (6), 0b101 (5), 6&5 =
        // a = 0b110
        // b = 0b101
        // res = 0b100 // 1&1 = 1, 1&0 = 0, 0&1 = 0, 0&0 = 0
        int bitwise_not = ~i;
        System.out.println("Bitwise not result: " + bitwise_not); //
        // 00000000000000110 -> 11111111111001

        // 00000110 -> 11111001

        // not operation and then add 1 to the binary number : 2's compliment

        int bitwise_and = i & j;
        System.out.println("Bitwise and result: " + bitwise_and);

        int bitwise_or = i | j;
        System.out.println("Bitwise or result : " + bitwise_or);

        int bitwise_xor = i ^ j;
        System.out.println("Bitwise xor result : " + bitwise_xor);

        /*
         * Relational operators: checks relations and return boolean result
         * <, >, <=, >=, ==, !=
         */

        boolean less_than = 5 < 7;
        boolean equality = 5 == 9;
        System.out.println("Less than : " + less_than);
        System.out.println("Equality : " + equality);

        /*
         * Logical operators:
         * && (Logical And), || (Logical Or)
         */

        // Logical And: returns true if a and b both are true,
        boolean logical_and = (1 < 9) && (6 > 8); // true && false : false
        System.out.println("Logical and : " + logical_and);

        // Logical Or
        boolean logical_or = (14 < 8) || (5 != 4);
        System.out.println("Logical Or : " + logical_or);

        // Ternary operator (? :)
        // checks for a condition and based on return of condition if performs some
        // action.
        // (condition) ? (true operation) : (false operation)
        String ternary = (11 % 2 == 0) ? "Even" : "Odd";
        System.out.println("Ternary result: " + ternary);

        int num = 5;
        String ternary2 = (num >= 0) ? "positive" : "negative";
        System.out.println("Ternary result2: " + ternary2);

        /*
         * Assignment operator:
         * +=, -=, *=, /=, %=, &=, ^=, |=, >>=, <<=
         */

        int m = 6;
        m += 5; // m = m + 5;
        System.out.println("Assignment addtion: " + m);

        m %= 2; // m = m % 2;
        System.out.println("Assignment modulus: " + m);

        // ------------- Practice ----------------------
        // 1.
        int x = 0, y = 0, z = 0;
        x = (++x + y--) * y; // (1 + 0) * -1 = -1
        // prefix: change the value and then use it
        // postfix: use the value and then change it
        System.out.println(x); // -1
        System.out.println("Y: " + y); // -1

        // 2.
        x = 4;
        y = --x; // 3
        z = x--; // 3
        // x = 2;
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        System.out.println("Z: " + z);

        // 3.
        x = 1;
        y = 3;
        y = x++ + x++ + x++ + x++; // y = 1 + 2 + 3 + 4 = 10, x= 5
        // y = 1 + 2 + 3 + 4
        System.out.println("3. X: " + x); // 5
        System.out.println("3. Y: " + y); // 10

        // 4.
        x = 9;
        y = 9;
        x = y++; // x = 9, y = 10
        System.out.println("4. x = " + x + ", y = " + y);
        y = x++; // x = 10, y = 9
        System.out.println("4. x = " + x + ", y = " + y);
        y = ++y; // x = 10, y = 10;
        System.out.println("4. x = " + x + ", y = " + y);

        int arr[] = new int[10];
        arr[1] = 5;
        System.out.println(arr); // class name @ hashcode of the class data (garbage string)

    }
}
