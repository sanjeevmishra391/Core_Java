// control statement(if-else, switch case, loops)

public class Class4 {
    public static void main(String[] args) {
        // block contains statements and it start and end with curly brackets.

        // if - else, switch case, loop, break, continue

        // 1. if - else:

        // if condition is true then `if` block will be executed
        // if the condition is false then `else` block will be executed
        /*
         * if (condition) {
         * // block 1
         * // statements
         * } else {
         * // block 2
         * // statements
         * }
         */
        int a = 5, b = 10;
        boolean condition = a > b;
        if (condition) {
            // executes when condition is true
            System.out.println("a is greater than b");
        } else {
            // executes when condition is false
            System.out.println("b is greater than a");
        }
        System.out.println("End of if-else block");

        // if it is raining then you are going to put on raincoat
        // else if it is sunny then you are going to put on tshirt
        // else you are going to put on pullover

        boolean sunny = true, rainy = true;
        if (sunny) {
            System.out.println("It is sunny and i am wearing tshirt");
        } else if (rainy) {
            System.out.println("It is raining and i am wearing raincoat");
        } else {
            System.out.println("It is neither sunny nor raining and i am wearing pullover");
        }

        // the first true condition block gets executed and rest are ignored

        // switch case.
        // 11 (Nov) - 2 (Feb) : winter, 3 (Mar) - 4 (Apr): spring,
        // 5 (May) - 7 (July): summer, 8 - 10: rainy
        int month = 5;

        // if (month >= 5 && month <= 7) {
        // System.out.println("It is summer season");
        // } else if (month >= 8 && month <= 10) {
        // System.out.println("It is rainy season");
        // } else if (month >= 3 && month <= 4) {
        // System.out.println("It is spring season");
        // } else if ((month >= 11 && month <= 12) || (month >= 1 && month <= 2)) {
        // System.out.println("It is winter season");
        // } else {
        // System.out.println("Enter the month in range [1,12]");
        // }

        // switch (expression) { }
        switch (month) {
            case 11:
            case 12:
            case 1:
            case 2:
                System.out.println("It is winter season");
                break;

            case 3:
            case 4:
                System.out.println("It is spring season");
                break;

            case 5:
            case 6:
            case 7:
                System.out.println("It is summer season");
                break;

            case 8:
            case 9:
            case 10:
                System.out.println("It is rainy season");
                break;

            default: // runs if none of the case is true
                System.out.println("Enter the month in range [1,12]");
        }

        char letter = 'A';
        switch (letter) {
            case 65:
                System.out.println("It is A");
                break;
            default:
                System.out.println("No match");
        }

        // ques: given a number check if it is in the range [1, 5] or [6, 10]
        int num = 8;
        switch (num) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It is in range [1, 5]");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("It is in range [6, 10]");
                break;
            default:
                System.out.println("Number is out of range [1,10]");
        }

        // nested if else;
        // check if number is in range [1, 10]
        // and if it is in the range check if it is odd or even.
        int n = 19;
        if (n < 11 && n > 0) {
            if (n % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }
        } else {
            System.out.println("Number is out of the range");
        }

        // --------- iteration statement: repetition of tasks. -------

        // for, while, do while

        // for(initialization; condition; increment/decrement) {
        // // statements
        // }

        // steps: 1. initialization -> checks condition -> run statements
        // -> increment/decrement -> checks condition -> run statements
        // -> increment/decrement -> checks condition -> run statements
        for (int i = 0; i < 5; i++) {
            System.out.println("value of i = " + i);
        }

        // while loop
        // while(condition) {
        // statements
        // }

        int count = 0;
        while (count < 10) {
            System.out.println("value of count  = " + count);
            count++;
        }

        // do while loop: runs the statements and then check the condition
        int count2 = 10;
        do {
            System.out.println("Count2 = " + count2);
            count2 += 2;
        } while (count2 < 10);

        // find the sum of the elements of array;
        int arr[] = { 2, 5, 10, 8, 6 };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        // sum = 0, i=0, sum = 0 + 2 = 2;
        // sum = 2, i=1, sum = 2 + 5 = 7;
        // sum = 7, i=2, sum = 7 + 10 = 17;
        // sum = 17, i=3, sum = 17 + 8 = 25;
        // sum = 25, i=4, sum = 25 + 6 = 31;
        int idx = 0, mul = 1;

        while (idx < arr.length) {
            mul = mul * arr[idx];
            idx++;
        }

        System.out.println("Sum of the array = " + sum);
        System.out.println("Multiplication of the array = " + mul);

        for (int i = 0, j = 1; i < 5; i++, j = j * 2) {
            System.out.println("i = " + i + " j = " + j);
        }

        int two_dimensional_initialized[][] = { { 1, 2, 3 }, { 4, 5, 6 } }; //
        // 1 2 3
        // 4 5 6
        int rows = two_dimensional_initialized.length; // 2
        int cols = two_dimensional_initialized[0].length; // 3
        // outer loop
        for (int i = 0; i < rows; i++) { // 2
            // inner loop
            for (int j = 0; j < cols; j++) { // 3 * 2 = 6
                System.out.print(two_dimensional_initialized[i][j] + " ");
            }
            System.out.println();
        }

        // i=0 -> enter outer loop:
        // j=3 : 1 2 3
        // i=1 ->
        // j=3 : 4 5 6

        System.out.println("End of the code");
    }
}
